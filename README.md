# panama-gl-bindings

The main repository is panama-gl. This one provides artifacts containing compiled classes for binding to OpenGL on various OS thanks to JExtract generated code.

Separating generated bindings from a wrapper API helps compile API code faster.

## Get Panama GL Bindings via Maven

Dependencies:
```xml
<dependencies>
  <dependency>
    <groupId>org.jzy3d</groupId>
    <artifactId>panama-gl-bindings-linux</artifactId>
    <version>1.0.0-SNAPSHOT</version>
  </dependency>
  <dependency>
    <groupId>org.jzy3d</groupId>
    <artifactId>panama-gl-bindings-macos</artifactId>
    <version>1.0.0-SNAPSHOT</version>
  </dependency>
  <dependency>
    <groupId>org.jzy3d</groupId>
    <artifactId>panama-gl-bindings-windows</artifactId>
    <version>1.0.0-SNAPSHOT</version>
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
