@REM uses the binaries from https://www.transmissionzero.co.uk/files/software/development/GLUT/freeglut-MSVC-3.0.0-2.mp.zip
@echo off
"C:\Program Files\Java\jextract-22\jextract"^
 -I .^
 --target-package freeglut.windows.x86^
 --header-class-name freeglut_h^
 --output ../../panama-gl-bindings-windows/src/generated/java^
 GL/freeglut.h
