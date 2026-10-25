
## Method 1 : Generate binding to precompiled freeglut binaries

### Download freeglut

* Find Freeglut [here](https://www.transmissionzero.co.uk/files/software/development/GLUT/freeglut-MSVC-3.0.0-2.mp.zip)

### Generate the binding with JExtract

* Navigate to `scripts/windows` and run on the CLI the following command, with jextract 22 and the include directory of a Windows SDK (Python is required) :

`generate_opengl.bat [jextract.bat] [Windows SDK include dir]`

It generates a single binding of OpenGL 1.1, GLU, freeglut, WGL and of the Win32 declarations used by PanamaGL (`symbols_windows.txt`), in package `opengl.windows`. The [Generate Windows binding](../../.github/workflows/generate-windows.yml) workflow runs it on a Windows runner and commits the binding on the branch it runs on.


## Method 2 : Generate binding to freeglut binaries compiled by yourself

Either build freeglut using Msys2 or Microsoft Visual Studio 

### 2.1 : using MSYS2

* Install CLang
* Open the `scripts/windows/build-freeglut-msys2.sh` script and follow the steps provided there on how to setup the required environment and how to run the script.

### 2.2 : using Microsoft Visual Studio C-Compiler

* Install Visual Studio
* Open the `scripts/windows/build-freeglut-msvsc.bat` script and follow the steps provided there on how to setup the required environment and how to run the script.

### Generate the binding with JExtract

* Navigate to `scripts/windows` and run `generate_opengl.bat`, as for method 1.

## Further reading

See the OpenGL example in [JExtract samples](https://github.com/openjdk/jextract/tree/master/samples/opengl).
