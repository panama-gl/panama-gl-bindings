@REM uses the binaries from https://www.transmissionzero.co.uk/files/software/development/GLUT/freeglut-MSVC-3.0.0-2.mp.zip
@echo off
"C:\Program Files\Java\jextract-19\bin\jextract"^
 -I .^
 --target-package opengl.windows.x86^
 --header-class-name glut_h^
 --source^
 --output ../../panama-gl-bindings-windows/src/generated/java^
 GL/freeglut_std.h