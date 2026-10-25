"""Print the function pointer types of glext.h whose declaration depends on the OS : the ones using
GLhandleARB, an unsigned int except on macOS where it is a void*. They are not in the glext binding,
but in the binding of each OS using them (Linux and Windows).

Usage : python os_dependent.py GL/glext.h
"""
import re
import sys

text = open(sys.argv[1], encoding='utf-8').read()
names = {name for name, args in re.findall(r'typedef [^;]*\(APIENTRYP (PFNGL\w+PROC)\)\s*\(([^;]*)\);', text)
         if 'GLhandleARB' in args}
names |= set(re.findall(r'typedef GLhandleARB \(APIENTRYP (PFNGL\w+PROC)\)', text))
print('\n'.join(sorted(names)))
