

JEXTRACT=/usr/lib/jvm/jextract-22/jextract

# Generate GLX bindings
$JEXTRACT \
  --target-package glext.linux \
  --output ../../panama-gl-bindings-linux/src/generated/java/ \
  --header-class-name glext_h \
  -lGL \
  -lGLX \
  -I  /usr/include/GL \
  include_glext.h
