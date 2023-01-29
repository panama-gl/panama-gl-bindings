

JEXTRACT=/usr/lib/jvm/jextract-19/bin/jextract

# Generate GLX bindings
$JEXTRACT \
  --target-package glx.ubuntu.v20 \
  --output ../../panama-gl-bindings-linux/src/generated/java/ \
  --source \
  --header-class-name glx_h \
  -lGL \
  -lGLX \
  -I  /usr/include/GL \
  /usr/include/GL/glx.h
