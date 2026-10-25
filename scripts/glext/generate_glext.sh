JEXTRACT=/usr/lib/jvm/jextract-22/jextract

# Generate the declarations of the Khronos glext.h that do not depend on the OS, shared by the wrappers
# of all OS, in package opengl.glext :
# * the function pointer types of the OpenGL functions (e.g. PFNGLGENBUFFERSPROC), through which the
#   wrappers invoke the functions they resolve at runtime (wglGetProcAddress, glXGetProcAddress, ...),
# * the OpenGL constants (e.g. GL_FRAMEBUFFER_EXT).
#
# GL/glext.h and KHR/khrplatform.h are the ones of the Khronos registries (OpenGL-Registry and
# EGL-Registry). include_glext.h declares the base types of gl.h instead of including the gl.h of
# the OS, which declares a part of glext.h.
#
# Generated the same way on Linux, Windows and macOS, these declarations are identical, except the
# function pointer types using GLhandleARB (unsigned int, void* on macOS) listed by os_dependent.py,
# which are generated in the bindings of Linux and Windows instead (see the glext per OS workflow
# of panama-gl).
rm -rf ../../panama-gl-bindings-glext/src/generated/java/opengl
$JEXTRACT --dump-includes all.includes -I . include_glext.h
python3 os_dependent.py GL/glext.h | sed 's/^/--include-typedef /; s/$/ /' > os_dependent.includes
grep -E -e '--include-typedef PFNGL' -e '--include-constant GL_' all.includes | sed 's/ *#.*/ /' \
  | grep -v -F -f os_dependent.includes > glext.includes
rm all.includes os_dependent.includes
$JEXTRACT \
  --target-package opengl.glext \
  --output ../../panama-gl-bindings-glext/src/generated/java/ \
  --header-class-name glext_h \
  @glext.includes \
  -I . \
  include_glext.h
rm glext.includes
