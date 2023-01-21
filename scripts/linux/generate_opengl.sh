

JEXTRACT=/usr/lib/jvm/jextract-19/bin/jextract

# Generate OpenGL Binding
$JEXTRACT \
  --target-package opengl.ubuntu.v20 \
  --output ../../panama-gl-bindings-linux/src/generated/java/ \
  --source \
  --header-class-name glut_h \
  -lGL \
  -l/usr/lib/x86_64-linux-gnu/libglut.so.3.9.0 \
  -l/usr/lib/x86_64-linux-gnu/libGLU.so.1.3.1 \
  -l/usr/lib/x86_64-linux-gnu/libGLEW.so \
  -I /usr/include/GL \
  /usr/include/GL/glut.h

# Generate GLX bindings
$JEXTRACT \
  --target-package glx.ubuntu.v20 \
  --output ../../panama-gl-bindings-linux/src/generated/java/ \
  --source \
  --header-class-name glx_h \
  -lGL \
  -l/usr/lib/x86_64-linux-gnu/libGLX.so \
  -I  /usr/include/GL \
  /usr/include/GL/glx.h
