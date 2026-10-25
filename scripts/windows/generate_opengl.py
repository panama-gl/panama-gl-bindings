"""Generate the Windows binding : a single binding of OpenGL 1.1, GLU, freeglut, WGL and of the Win32
declarations used by PanamaGL, in package opengl.windows, instead of the whole windows.h.

The declarations are selected among the ones dumped by jextract --dump-includes : all the ones of the
OpenGL, GLU, freeglut and WGL headers, the Win32 ones named in symbols_windows.txt, and the ones they
depend on, added each time jextract reports "X depends on Y which has been excluded".

The function pointer types of the OpenGL functions (PFNGL...PROC) are in the glext binding, shared by
all OS, except the ones depending on the OS listed by ../glext/os_dependent.py, generated here from the
Khronos glext.h.

Usage : python generate_opengl.py <jextract> <Windows SDK include dir> <output dir>
"""
import fnmatch
import ntpath
import re
import shutil
import subprocess
import sys

HEADERS = {'gl.h', 'glu.h', 'freeglut.h', 'freeglut_std.h', 'freeglut_ext.h', 'freeglut_ucall.h', 'wgl.h'}

OPTION = re.compile(r'^(--include-\w+)\s+(\S+)\s*(?:#\s*header:\s*(.*))?$')

EXCLUDED_DEPENDENCY = re.compile(r'depends on (\w+) which has been excluded')


def jextract(command, options):
  print(' '.join(command + options), flush=True)
  result = subprocess.run(command + options, capture_output=True, text=True)
  output = result.stdout + result.stderr
  print('\n'.join(line for line in output.splitlines() if 'warning' not in line), flush=True)
  return result.returncode, output


def main(jextract_bin, sdk, output):
  includes = ['-I', '.', '-I', sdk + r'\um', '-I', sdk + r'\shared', '-I', sdk + r'\ucrt', '-I', r'..\glext']
  command = [jextract_bin]

  code, _ = jextract(command, ['--dump-includes', 'all.includes'] + includes + ['include_windows.h'])
  if code != 0:
    return code
  dumped = {}
  with open('all.includes', encoding='utf-8') as f:
    for line in f:
      match = OPTION.match(line.strip())
      if match:
        option, name, header = match.groups()
        dumped.setdefault(name, []).append((option, header))

  with open('symbols_windows.txt', encoding='utf-8') as f:
    patterns = [line.strip() for line in f if line.strip() and not line.startswith('#')]
  patterns += subprocess.run([sys.executable, r'..\glext\os_dependent.py', r'..\glext\GL\glext.h'],
                             capture_output=True, text=True, check=True).stdout.split()
  selected = set()
  for name, options in dumped.items():
    for option, header in options:
      if header is not None and ntpath.basename(header.strip()).lower() in HEADERS \
          and not (option == '--include-typedef' and name.startswith('PFNGL')):
        selected.add((option, name))
  for pattern in patterns:
    names = [name for name in dumped if fnmatch.fnmatchcase(name, pattern)]
    if not names:
      print(f'Warning, {pattern} not found')
    for name in names:
      selected.update((option, name) for option, _ in dumped[name])

  for attempt in range(50):
    with open('windows.includes', 'w', encoding='utf-8') as f:
      f.writelines(f'{option} {name}\n' for option, name in sorted(selected))
    print(f'{len(selected)} declarations selected', flush=True)
    shutil.rmtree(output, ignore_errors=True)
    code, out = jextract(command, ['--target-package', 'opengl.windows', '--header-class-name', 'gl_h',
                                   '--output', output, '@windows.includes'] + includes + ['include_windows.h'])
    missing = set(EXCLUDED_DEPENDENCY.findall(out))
    if code == 0 and not missing:
      return 0
    added = {(option, name) for name in missing for option, _ in dumped.get(name, [])}
    if not added - selected:
      print('jextract failed', flush=True)
      return code or 1
    print('Adding the excluded dependencies ' + ', '.join(sorted(missing)), flush=True)
    selected |= added
  return 1


if __name__ == '__main__':
  sys.exit(main(*sys.argv[1:]))
