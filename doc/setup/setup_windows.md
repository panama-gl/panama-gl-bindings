
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

## Build freeglut.dll for panama-gl-bindings-windows-freeglut

The optional [`panama-gl-bindings-windows-freeglut`](../../panama-gl-bindings-windows-freeglut/README.md) module embeds a `freeglut.dll` for x86_64 and ARM64. They are cross-compiled with Zig from any Linux or macOS computer, no Windows nor Visual Studio being required :

* Install CMake, Ninja and [Zig](https://ziglang.org/download/) (or `pip install ziglang==0.17.0`)
* Navigate to `scripts/windows` and run

```
./build-freeglut-cross.sh v3.8.0 x64
./build-freeglut-cross.sh v3.8.0 arm64
```

Each command copies `freeglut.dll` and the freeglut license in `panama-gl-bindings-windows-freeglut/src/main/resources/natives/windows-<cpu>`. The build is reproducible : with the same freeglut tag and Zig version, it produces the very same DLL, which the [freeglut for Windows](../../.github/workflows/freeglut-windows.yml) workflow checks on Linux and macOS.

## Further reading

See the OpenGL example in [JExtract samples](https://github.com/openjdk/jextract/tree/master/samples/opengl).
