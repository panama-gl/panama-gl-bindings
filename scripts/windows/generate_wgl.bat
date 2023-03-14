@REM uses the binaries from C:\Windows\System32\opengl32.dll
@echo off
"C:\Program Files\Java\jextract-19\bin\jextract"^
 -I "C:\Program Files (x86)\Windows Kits\10\Include\10.0.19041.0\um"^
 --target-package wgl.windows.x86^
 --header-class-name wgl_h^
 --source^
 --output ../../panama-gl-bindings-windows/src/generated/java^
 include_wgl.h
