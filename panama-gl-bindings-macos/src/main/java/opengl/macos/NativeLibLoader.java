package opengl.macos;

public class NativeLibLoader {
  public static void load() {
    loadGL();
    loadGLUT();
  }

  public static void loadGLUT() {
    System.load("/System/Library/Frameworks/GLUT.framework/Versions/Current/GLUT");
  }

  public static void loadGL() {
    System.load("/System/Library/Frameworks/OpenGL.framework/OpenGL");
  }
}
