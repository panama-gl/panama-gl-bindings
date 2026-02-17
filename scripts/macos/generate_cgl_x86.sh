sudo xattr -r -d com.apple.quarantine /Library/Java/JavaVirtualMachines/jextract-19/bin/

JEXTRACT=/Library/Java/JavaVirtualMachines/jextract-22/jextract

#SDK_DIR=/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/
#-F/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/

# If SDK_DIR is changed, it needs to be changed in compile_flags.txt as well.
SDK_DIR=/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk
#-F/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks

# Generate CGL Binding
$JEXTRACT \
  -I $SDK_DIR/usr/include \
  -I /Library/Developer/CommandLineTools/SDKs/MacOSX10.15.sdk/System/Library/Frameworks/OpenGL.framework/Versions/A/Headers \
  -I /Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/ \
#  -lOpenGL.framework \
#  -lGLUT.framework \
  --target-package cgl.macos.x86 \
  --output ../../panama-gl-bindings-macos/src/generated/java/ \
  --source \
  --header-class-name cgl_h \
 include_cgl.h
