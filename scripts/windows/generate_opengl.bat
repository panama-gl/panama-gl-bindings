@REM Generate a single binding of OpenGL 1.1, GLU, freeglut, WGL and of the Win32 functions used by
@REM PanamaGL, in package opengl.windows. The declarations are selected by filter_includes.py : all the
@REM ones of the OpenGL, GLU, freeglut and WGL headers, and the Win32 ones of symbols_windows.txt.
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

call "%JEXTRACT%" --dump-includes all.includes -I . -I "%SDK_DIR%\um" -I "%SDK_DIR%\shared" -I "%SDK_DIR%\ucrt" include_windows.h || exit /b 1
python filter_includes.py all.includes symbols_windows.txt windows.includes || exit /b 1
del all.includes

if exist %OUT% rmdir /S /Q %OUT%
call "%JEXTRACT%"^
 --target-package opengl.windows^
 --header-class-name gl_h^
 --output %OUT%^
 @windows.includes^
 -I . -I "%SDK_DIR%\um" -I "%SDK_DIR%\shared" -I "%SDK_DIR%\ucrt"^
 include_windows.h || exit /b 1
del windows.includes
