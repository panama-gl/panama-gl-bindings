

JEXTRACT=/usr/lib/jvm/jextract-19/bin/jextract

# Generate GLX bindings
$JEXTRACT \
  --target-package glxext.ubuntu.v20 \
  --output ../../panama-gl-bindings-linux/src/generated/java/ \
  --source \
  --header-class-name glxext_h \
  -lGL \
  -lGLX \
  -I  /usr/include/GL \
  include_glxext.h
