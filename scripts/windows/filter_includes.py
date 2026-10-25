"""Select the declarations of the Windows binding among the ones dumped by jextract --dump-includes.

Keeps all the declarations of the OpenGL, GLU, freeglut and WGL headers, and the Win32 declarations
named in symbols_windows.txt, instead of the whole windows.h (COM, RPC, shell, ...).

Usage : python filter_includes.py all.includes symbols_windows.txt windows.includes
"""
import fnmatch
import ntpath
import re
import sys

HEADERS = {'gl.h', 'glu.h', 'freeglut.h', 'freeglut_std.h', 'freeglut_ext.h', 'freeglut_ucall.h', 'wgl.h'}

OPTION = re.compile(r'^(--include-\w+)\s+(\S+)\s*(?:#\s*header:\s*(.*))?$')


def main(dump, symbols_file, output):
  with open(symbols_file, encoding='utf-8') as f:
    patterns = [line.strip() for line in f if line.strip() and not line.startswith('#')]
  kept, matched = [], set()
  with open(dump, encoding='utf-8') as f:
    for line in f:
      match = OPTION.match(line.strip())
      if not match:
        continue
      option, name, header = match.groups()
      by_header = header is not None and ntpath.basename(header.strip()).lower() in HEADERS
      by_name = [p for p in patterns if fnmatch.fnmatchcase(name, p)]
      if by_header or by_name:
        kept.append(f'{option} {name}\n')
        matched.update(by_name)
  with open(output, 'w', encoding='utf-8') as f:
    f.writelines(kept)
  print(f'{len(kept)} declarations kept in {output}')
  missing = [p for p in patterns if p not in matched]
  if missing:
    print('Warning, not found : ' + ', '.join(missing))
  return 0


if __name__ == '__main__':
  sys.exit(main(*sys.argv[1:]))
