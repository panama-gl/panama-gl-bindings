package opengl.macos;

public class NativeLibLoader {
  public static void load() {
    System.load("/System/Library/Frameworks/OpenGL.framework/OpenGL");
    System.load("/System/Library/Frameworks/GLUT.framework/Versions/Current/GLUT");
  }
}
