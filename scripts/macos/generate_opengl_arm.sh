sudo xattr -r -d com.apple.quarantine /Library/Java/JavaVirtualMachines/jextract-22/

JEXTRACT=/Library/Java/JavaVirtualMachines/jextract-22/jextract

#SDK_DIR=/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/
#-F/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/

# If SDK_DIR is changed, it needs to be changed in compile_flags.txt as well.
SDK_DIR=/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk
#-F/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks

# Generate OpenGL Binding
$JEXTRACT \
  -I $SDK_DIR/usr/include \
  -I /Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/ \
  -lGLUT.framework \
  --target-package opengl.macos.arm \
  --output ../../panama-gl-bindings-macos/src/generated/java/ \
  --header-class-name glut_h \
 include_opengl.h
 # -lOpenGL.framework \



# Can't find OpenGL/OpenGLAvailability.h with this
#/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks/GLUT.framework/Headers/glut.h
#-l/System/Library/Frameworks/GLUT.framework/Versions/Current/GLUT \
