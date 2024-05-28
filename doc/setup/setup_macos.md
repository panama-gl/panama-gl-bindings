
# Install tools and librairies to work with OpenGL on macOS

* Get [XCode as required by your macOS](https://developer.apple.com/support/xcode/) version (or use App Store but forces latest version for later OS not always supported by old MacBooks)

* After logging with an Apple ID, search the XCode version that fits your OS : https://developer.apple.com/download/all/?q=xcode%2012.4

# How I built the OpenGL bindings

See the OpenGL example in [JExtract samples](https://github.com/openjdk/jextract/tree/master/samples).

## Generate OpenGL Java bindings with JExtract

[This](scripts) allows generating OpenGL Java Wrapper. The generated packages are already in `src/main/java` so you don't need to do it, it is just a helper for adding wrappers for new platforms.

### General pattern

```
jextract -d {OUTPUT_DIR} --source -t {PACKAGE_NAME} \
-lGL \
-l{GLUT_LIB} \
-I {GL_AND_GLUT_INCLUDE_DIR} \
-C{ARGS_FOR_CLANG} \
{GLUT_HEADER_FILE}
```


