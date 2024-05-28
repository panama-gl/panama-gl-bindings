

JEXTRACT=/usr/lib/jvm/jextract-22/jextract

# Generate GLX bindings
$JEXTRACT \
  --target-package glx.linux.x86 \
  --output ../../panama-gl-bindings-linux/src/generated/java/ \
  --header-class-name glx_h \
  -lGL \
  -lGLX \
  -I  /usr/include/GL \
  /usr/include/GL/glx.h
