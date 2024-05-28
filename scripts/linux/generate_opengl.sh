

JEXTRACT=/usr/lib/jvm/jextract-22/jextract

# Generate OpenGL Binding
$JEXTRACT \
  --target-package opengl.linux.x86 \
  --output ../../panama-gl-bindings-linux/src/generated/java/ \
  --header-class-name glut_h \
  -lGL \
  -lglut \
  -lGLU \
  -lGLEW \
  -I /usr/include/GL \
  /usr/include/GL/glut.h


#  -l/usr/lib/x86_64-linux-gnu/libglut.so.3.9.0 \
#  -l/usr/lib/x86_64-linux-gnu/libGLU.so.1.3.1 \
#  -l/usr/lib/x86_64-linux-gnu/libGLEW.so \
