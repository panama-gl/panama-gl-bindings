set SDK_DIR="C:\Program Files (x86)\Windows Kits\10\Include\10.0.19041.0"
set JDK_DIR="C:\Program Files\Java\jdk-19.0.2"
set JEXTRACT="C:\Program Files\Java\jextract-19\bin\jextract"


 @REM make JAWT
 @echo off
 call %JEXTRACT%^
  -I "C:\Program Files\Java\jdk-19.0.2\include"^
  -I "C:\Program Files\Java\jdk-19.0.2\include\win32"^
  --target-package jawt.windows.x86^
  --header-class-name jawt_h^
  --source^
  --output ../../panama-gl-bindings-windows-jawt/src/generated/java^
  include_jawt.h
