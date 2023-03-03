sudo xattr -r -d com.apple.quarantine /Library/Java/JavaVirtualMachines/jextract-19/bin/

JEXTRACT=/Library/Java/JavaVirtualMachines/jextract-19/bin/jextract

#SDK_DIR=/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/
#-F/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/

# If SDK_DIR is changed, it needs to be changed in compile_flags.txt as well.
SDK_DIR=/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk
#-F/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks

# Generate CGL Binding
sudo $JEXTRACT \
  -I $SDK_DIR/usr/include \
  -I /Library/Java/JavaVirtualMachines/jdk-19.0.2.jdk/Contents/Home/include/ \
  -I /Library/Java/JavaVirtualMachines/jdk-19.0.2.jdk/Contents/Home/include/darwin \
  --target-package jawt.macos.arm \
  --output ../../panama-gl-bindings-macos/src/generated/java/ \
  --source \
  --header-class-name jawt_h \
 include_jawt.h

 #  -I /Library/Developer/CommandLineTools/SDKs/MacOSX10.15.sdk/System/Library/Frameworks/OpenGL.framework/Versions/A/Headers \
 #  -I /Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/ \
 #  -lOpenGL.framework \
 #  -lGLUT.framework \
