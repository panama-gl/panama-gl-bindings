set SDK_DIR=C:\Program Files (x86)\Windows Kits\10\Include\10.0.19041.0
set JEXTRACT="C:\Program Files\Java\jextract-19\bin\jextract"

@REM uses the binaries from C:\Windows\System32\opengl32.dll
@echo off
call %JEXTRACT%^
 -I "%SDK_DIR%\um" ^
 -I "%SDK_DIR%\shared" ^
 --target-package wglext.windows.x86^
 --header-class-name wglext_h^
 --source^
 --output ../../panama-gl-bindings-windows/src/generated/java^
 include_wglext.h
