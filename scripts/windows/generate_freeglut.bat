@REM uses the binaries from https://www.transmissionzero.co.uk/files/software/development/GLUT/freeglut-MSVC-3.0.0-2.mp.zip
@echo off
jextract^
 -I .^
 --target-package opengl^
 --header-class-name freeglut_h^
 --source^
 --output ../../panama-gl-bindings-windows/src/generated/java^
 GL/freeglut.h
