JEXTRACT=/usr/lib/jvm/jextract-22/jextract

# Generate the declarations of OpenGL that do not depend on the OS, shared by the wrappers of all OS :
# * the function pointer types of the OpenGL functions (e.g. PFNGLGENBUFFERSPROC), through which the
#   wrappers invoke the functions they resolve at runtime (wglGetProcAddress, glXGetProcAddress, ...),
# * the OpenGL constants (e.g. GL_FRAMEBUFFER_EXT).
#
# Their descriptors only depend on the OpenGL types, which have the same size on all OS and CPUs
# supported by PanamaGL. The OpenGL functions are not generated : they are declared by the binding of
# each OS, which looks them up in the libraries of the OS.
#
# Generated on Linux with the headers of Mesa, which include the Khronos glext.h.
rm -rf ../../panama-gl-bindings-gl/src/generated/java/opengl
$JEXTRACT --dump-includes all.includes -I /usr/include/GL include_gl.h
grep -E -e '--include-typedef PFNGL[^X]' -e '--include-constant GL_' all.includes > gl.includes
rm all.includes
$JEXTRACT \
  --target-package opengl.gl \
  --output ../../panama-gl-bindings-gl/src/generated/java/ \
  --header-class-name glext_h \
  @gl.includes \
  -I /usr/include/GL \
  include_gl.h
rm gl.includes
