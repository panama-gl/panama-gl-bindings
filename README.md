# panama-gl-bindings

The main repository is panama-gl. This one provides artifacts containing compiled classes for binding to OpenGL on various OS thanks to JExtract generated code.

Separating generated bindings from a wrapper API helps compile API code faster.

## Get Panama GL Bindings via Maven

* `panama-gl-bindings-glext` : the declarations of the Khronos `glext.h` that do not depend on the OS, used by the wrappers of all OS : the function pointer types of the OpenGL functions (e.g. `PFNGLGENBUFFERSPROC`) and the OpenGL constants, in package `opengl.glext`. Generated the same way on Linux, Windows and macOS, they are identical, except the 23 function pointer types using `GLhandleARB` (`unsigned int`, `void*` on macOS), which are in the Linux and Windows bindings instead (see `scripts/glext`).
* `panama-gl-bindings-linux`, `panama-gl-bindings-macos`, `panama-gl-bindings-windows` : the OpenGL, GLU, GLUT and windowing system (GLX, CGL, WGL) functions of each OS. A binding serves both x86_64 and ARM64. The Windows binding only contains OpenGL 1.1, GLU, freeglut, WGL and the Win32 declarations used by PanamaGL (see `scripts/windows/symbols_windows.txt`), instead of the whole `windows.h`.

Dependencies:
```xml
<dependencies>
  <dependency>
    <groupId>org.jzy3d</groupId>
    <artifactId>panama-gl-bindings-glext</artifactId>
    <version>1.4.1</version>
  </dependency>
  <dependency>
    <groupId>org.jzy3d</groupId>
    <artifactId>panama-gl-bindings-linux</artifactId>
    <version>1.4.1</version>
  </dependency>
  <dependency>
    <groupId>org.jzy3d</groupId>
    <artifactId>panama-gl-bindings-macos</artifactId>
    <version>1.4.1</version>
  </dependency>
  <dependency>
    <groupId>org.jzy3d</groupId>
    <artifactId>panama-gl-bindings-windows</artifactId>
    <version>1.4.1</version>
  </dependency>
</dependencies>
```

Repositories:
```xml
<repositories>
  <repository>
    <id>jzy3d-snapshots</id>
    <name>Jzy3d Snapshots</name>
    <url>https://maven.jzy3d.org/snapshots/</url>
  </repository>
  <repository>
    <id>jzy3d-releases</id>
    <name>Jzy3d Releases</name>
    <url>https://maven.jzy3d.org/releases/</url>
  </repository>
</repositories>
```

## Deploy
```
mvn deploy -DskipTests -Denv.MAVEN_REPO_URL=ftp://ftp.cluster013.ovh.net/                                                                
```
