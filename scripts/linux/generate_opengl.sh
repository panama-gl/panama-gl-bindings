
JEXTRACT=/usr/lib/jvm/jextract-22/jextract

# Generate a single binding of OpenGL, GLU, GLUT, GLX and X11 : gl.h includes glext.h,
# and glx.h includes gl.h, glxext.h and Xlib.h.
#
# No library is given with -l : the generated code looks the functions up in the libraries
# loaded by opengl.linux.NativeLibLoader (SymbolLookup.loaderLookup()), then in the default
# lookup of the native linker.
#
# The binding is the same for x86_64 and ARM64.
rm -rf ../../panama-gl-bindings-linux/src/generated/java/opengl
$JEXTRACT \
  --target-package opengl.linux \
  --output ../../panama-gl-bindings-linux/src/generated/java/ \
  --header-class-name gl_h \
  -I /usr/include/GL \
  include_linux.h
