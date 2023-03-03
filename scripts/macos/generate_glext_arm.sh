sudo xattr -r -d com.apple.quarantine /Library/Java/JavaVirtualMachines/jextract-19/bin/

JEXTRACT=/Library/Java/JavaVirtualMachines/jextract-19/bin/jextract

#SDK_DIR=/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/
#-F/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/

# If SDK_DIR is changed, it needs to be changed in compile_flags.txt as well.
SDK_DIR=/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk
#-F/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks

# Generate OpenGL EXT Binding (for GL > 1.1)
$JEXTRACT \
  -I $SDK_DIR/usr/include \
  -I /Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/ \
  -lOpenGL.framework \
  -lGLUT.framework \
  --target-package glext.macos.arm \
  --output ../../panama-gl-bindings-macos/src/generated/java/ \
  --source \
  --header-class-name glext_h \
include_glext.h

# Can't find OpenGL/OpenGLAvailability.h with this
#/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks/GLUT.framework/Headers/glut.h
#-l/System/Library/Frameworks/GLUT.framework/Versions/Current/GLUT \
