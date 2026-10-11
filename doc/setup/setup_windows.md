
## Method 1 : Generate binding to precompiled freeglut binaries

### Download freeglut

* Find Freeglut [here](https://www.transmissionzero.co.uk/files/software/development/GLUT/freeglut-MSVC-3.0.0-2.mp.zip)

### Build OpenGL java wrappers with JExtract

* Navigate to `scripts/windows` and run on the CLI the following command:

`generate_glut.bat`


## Method 2 : Generate binding to freeglut binaries compiled by yourself

Either build freeglut using Msys2 or Microsoft Visual Studio 

### 2.1 : using MSYS2

* Install CLang
* Open the `scripts/windows/build-freeglut-msys2.sh` script and follow the steps provided there on how to setup the required environment and how to run the script.

### 2.2 : using Microsoft Visual Studio C-Compiler

* Install Visual Studio
* Open the `scripts/windows/build-freeglut-msvsc.bat` script and follow the steps provided there on how to setup the required environment and how to run the script.

### 2.3 : cross-compiling from Linux or macOS with Zig

* Install CMake, Ninja and [Zig](https://ziglang.org/download/) (or `pip install ziglang`)
* Open the `scripts/windows/build-freeglut-cross.sh` script and follow the steps provided there on how to run the script. It builds a `freeglut.dll` for x64 or ARM64 CPUs, e.g. :

`build-freeglut-cross.sh v3.8.0 arm64 <destination-dir>`

This is how the `freeglut.dll` embedded in `panama-gl-wrappers-windows` are built.

### Build OpenGL java wrappers with JExtract

* Navigate to `scripts/windows` and run on the CLI the following command:

`generate_freeglut.bat`

## Further reading

See the OpenGL example in [JExtract samples](https://github.com/openjdk/jextract/tree/master/samples/opengl).
