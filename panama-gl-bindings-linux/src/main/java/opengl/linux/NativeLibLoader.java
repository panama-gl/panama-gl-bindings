package opengl.linux;

public class NativeLibLoader {
  public static void load() {
    System.loadLibrary("GL");
    System.loadLibrary("glut");
    System.loadLibrary("GLU");
    System.loadLibrary("GLX");
  }
}
