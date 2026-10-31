# panama-gl-bindings-windows-freeglut

An **optional** jar containing [freeglut](https://github.com/FreeGLUTProject/freeglut) 3.8.0 for Windows, built for both 64 bit CPUs :

| Resource | CPU | `os.arch` of the JVM |
|---|---|---|
| `natives/windows-x86_64/freeglut.dll` | Intel / AMD 64 bit | `amd64` |
| `natives/windows-aarch64/freeglut.dll` | ARM64 | `aarch64` |

It contains no Java class : the Windows wrappers of PanamaGL (`panama-gl-wrappers-windows`) look these resources up in the classpath.

## Do I need it ?

Most probably not. Windows provides OpenGL (`opengl32.dll`) and GLU (`glu32.dll`) but not freeglut, and PanamaGL does not need freeglut to render on Windows :

* the default GL context is created with WGL,
* all the OpenGL and GLU functions of `GL` work without freeglut.

freeglut is only required if the application

* invokes a GLUT function of `GL`, e.g. `glutSolidTeapot`, `glutBitmapString` or `glutStrokeCharacter`,
* or uses the GLUT GL context (`GLUTContext_windows`) instead of the WGL one.

PanamaGL loads freeglut **lazily** : `freeglut.dll` is only opened, and `glutInit` only invoked, at the first call to one of these functions or at the creation of a GLUT context. An application that does not use GLUT never opens it, whether this jar is in the classpath or not.

Add this jar if the application uses GLUT and freeglut may not be installed on the computers it runs on :

```xml
<dependency>
  <groupId>org.jzy3d</groupId>
  <artifactId>panama-gl-bindings-windows-freeglut</artifactId>
  <version>1.4.1</version>
  <scope>runtime</scope>
</dependency>
```

## How freeglut is loaded

At the first use of GLUT, PanamaGL loads freeglut

1. from the `java.library.path` if a `freeglut.dll` is there (`System.loadLibrary("freeglut")`) : an installed freeglut always has precedence over this jar,
2. otherwise from this jar : the DLL of the CPU of the JVM is extracted in `<java.io.tmpdir>/panamagl/<hash of the DLL>/freeglut.dll` and loaded from there. An extracted DLL is reused by the next runs and by concurrent JVMs instead of being written again.

If neither is available, the GLUT function throws an `UnsatisfiedLinkError` saying freeglut was not found in the `java.library.path` and that this jar is not in the classpath.

Both DLLs are needed : a DLL can only be loaded by a process of the same CPU, and Windows on ARM computers run ARM64 JVMs, which cannot load the x86_64 DLL. 32 bit Windows is not supported.

The DLLs only depend on DLLs of Windows 10 and later : `OPENGL32`, `GDI32`, `USER32`, `KERNEL32`, `ADVAPI32`, `WINMM` and the Universal C Runtime (`api-ms-win-crt-*`).

## How the DLLs are built

They are cross-compiled with [Zig](https://ziglang.org) 0.17.0 by [`scripts/windows/build-freeglut-cross.sh`](../scripts/windows/build-freeglut-cross.sh), from any Linux or macOS computer : neither Windows nor Visual Studio is required, Zig providing the C compiler, resource compiler, linker and the MinGW-w64 headers and libraries of both CPUs.

```
pip install ziglang==0.17.0 cmake ninja
scripts/windows/build-freeglut-cross.sh v3.8.0 x64
scripts/windows/build-freeglut-cross.sh v3.8.0 arm64
```

Each command writes `freeglut.dll` and the freeglut license in `src/main/resources/natives/windows-<cpu>` of this module.

The build is reproducible : the same freeglut tag built with the same Zig version gives a byte for byte identical DLL, whatever the computer and directory it is built in. The [freeglut for Windows](../.github/workflows/freeglut-windows.yml) workflow rebuilds both DLLs on Linux and macOS and fails if they differ from the committed ones, which guarantees the jar contains what the script builds from the freeglut sources.

| DLL | SHA-256 |
|---|---|
| `windows-x86_64/freeglut.dll` | `4b0fef403a0401340583b1fd1dd9606d0902f146faf2188fcc0f62bad3b5c30f` |
| `windows-aarch64/freeglut.dll` | `e34ed8370e340d962ff634fdd9837b74a0cca7d4ac2cf8618fafcfa45bfc0bf9` |

To upgrade freeglut, run the script with the new tag, update the version in this file and the hashes above, and commit the DLLs.

## License

freeglut is distributed under the X-Consortium license, copied in `COPYING` next to each DLL.
