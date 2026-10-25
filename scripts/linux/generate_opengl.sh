
JEXTRACT=/usr/lib/jvm/jextract-22/jextract

# Generate a single binding of OpenGL, GLU, GLUT, GLX and X11 : gl.h includes glext.h,
# and glx.h includes gl.h, glxext.h and Xlib.h.
#
# No library is given with -l : the generated code looks the functions up in the libraries
# loaded by opengl.linux.NativeLibLoader (SymbolLookup.loaderLookup()), then in the default
# lookup of the native linker.
#
# The function pointer types of the OpenGL functions (e.g. PFNGLGENBUFFERSPROC) are not generated :
# they do not depend on the OS and are in panama-gl-bindings-gl (package opengl.gl). The ones of
# GLX (e.g. PFNGLXCREATECONTEXTATTRIBSARBPROC) are.
#
# The binding is the same for x86_64 and ARM64.
rm -rf ../../panama-gl-bindings-linux/src/generated/java/opengl
$JEXTRACT --dump-includes all.includes -I /usr/include/GL include_linux.h
grep -v -E -e '--include-typedef PFNGL[^X]' all.includes > linux.includes
rm all.includes
$JEXTRACT \
  --target-package opengl.linux \
  --output ../../panama-gl-bindings-linux/src/generated/java/ \
  --header-class-name gl_h \
  @linux.includes \
  -I /usr/include/GL \
  include_linux.h
rm linux.includes
