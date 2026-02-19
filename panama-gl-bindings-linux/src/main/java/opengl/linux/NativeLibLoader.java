package opengl.linux;

public class NativeLibLoader {
  public static void load() {
    loadGL();
    loadGLUT();
    loadGLU();
    loadGLX();
  }

  public static void loadGLX() {
    System.loadLibrary("GLX");
  }

  public static void loadGLU() {
    System.loadLibrary("GLU");
  }

  public static void loadGLUT() {
    System.loadLibrary("glut");
  }

  public static void loadGL() {
    System.loadLibrary("GL");
  }
}
