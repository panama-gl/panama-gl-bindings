

JEXTRACT=/usr/lib/jvm/jextract-19/bin/jextract

# Generate GLX bindings
$JEXTRACT \
  --target-package glext.ubuntu.v20 \
  --output ../../panama-gl-bindings-linux/src/generated/java/ \
  --source \
  --header-class-name glext_h \
  -lGL \
  -lGLX \
  -I  /usr/include/GL \
  include_glext.h
