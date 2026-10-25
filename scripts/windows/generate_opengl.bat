@REM Generate a single binding of OpenGL 1.1, GLU, freeglut, WGL and of the Win32 declarations used by
@REM PanamaGL, in package opengl.windows, with the declarations selected by generate_opengl.py : all the
@REM ones of the OpenGL, GLU, freeglut and WGL headers, the Win32 ones of symbols_windows.txt and their
@REM dependencies.
@REM
@REM No library is given with -l : the generated code looks the functions up in the libraries loaded
@REM by opengl.windows.NativeLibLoader. The binding is the same for x86_64 and ARM64.
@REM
@REM Usage : generate_opengl.bat [jextract] [Windows SDK include dir]
@echo off
setlocal
set JEXTRACT=%~1
if "%JEXTRACT%"=="" set JEXTRACT=C:\Program Files\Java\jextract-22\bin\jextract.bat
set SDK_DIR=%~2
if "%SDK_DIR%"=="" set SDK_DIR=C:\Program Files (x86)\Windows Kits\10\Include\10.0.19041.0
set OUT=..\..\panama-gl-bindings-windows\src\generated\java

python generate_opengl.py "%JEXTRACT%" "%SDK_DIR%" %OUT% || exit /b 1
del all.includes windows.includes
