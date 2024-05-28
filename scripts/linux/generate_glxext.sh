

JEXTRACT=/usr/lib/jvm/jextract-22/jextract

# Generate GLX bindings
$JEXTRACT \
  --target-package glxext.linux.x86 \
  --output ../../panama-gl-bindings-linux/src/generated/java/ \
  --header-class-name glxext_h \
  -lGL \
  -lGLX \
  -I  /usr/include/GL \
  include_glxext.h
