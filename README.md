# panama-gl-bindings

The main repository is panama-gl. This one provides artifacts containing compiled classes for binding to OpenGL on various OS thanks to JExtract generated code.

Separating generated bindings from a wrapper API helps compile API code faster.

## Get Panama GL Bindings via Maven

* `panama-gl-bindings-gl` : the declarations of OpenGL that do not depend on the OS, used by the wrappers of all OS : the function pointer types of the OpenGL functions (e.g. `PFNGLGENBUFFERSPROC`) and the OpenGL constants, in package `opengl.gl`.
* `panama-gl-bindings-linux`, `panama-gl-bindings-macos`, `panama-gl-bindings-windows` : the OpenGL, GLU, GLUT and windowing system (GLX, CGL, WGL) functions of each OS. A binding serves both x86_64 and ARM64.

Dependencies:
```xml
<dependencies>
  <dependency>
    <groupId>org.jzy3d</groupId>
    <artifactId>panama-gl-bindings-gl</artifactId>
    <version>1.4.0</version>
  </dependency>
  <dependency>
    <groupId>org.jzy3d</groupId>
    <artifactId>panama-gl-bindings-linux</artifactId>
    <version>1.4.0</version>
  </dependency>
  <dependency>
    <groupId>org.jzy3d</groupId>
    <artifactId>panama-gl-bindings-macos</artifactId>
    <version>1.4.0</version>
  </dependency>
  <dependency>
    <groupId>org.jzy3d</groupId>
    <artifactId>panama-gl-bindings-windows</artifactId>
    <version>1.4.0</version>
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
