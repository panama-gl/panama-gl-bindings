package opengl.windows;

public class NativeLibLoader {
  /** Load OpenGL related DLL : opengl32, glu32, freeglut */
  public static void load() {
    loadGL();
    loadGLU();
    loadGLUT();
  }

  public static void loadGL() {
    System.loadLibrary("opengl32");
  }

  public static void loadGLU() {
    System.loadLibrary("glu32");
  }

  public static void loadGLUT() {
    System.loadLibrary("freeglut");
  }

  
  /** Load required windows DLL : user32, gdi32, kernel32 */
  public static void loadWindowsDLLs() {
    // to invoke getDC(), ShowWindow() on Windows
    System.loadLibrary("User32"); 
    
    // to invoke ChoosePixelFormat()
    System.loadLibrary("Gdi32");
    
    // to invoke GetLastError()
    System.loadLibrary("Kernel32");
  }

}
