package opengl.windows;

public class NativeLibLoader {
  /** Load OpenGL related DLL : opengl32, glu32, freeglut */
  public static void load() {
    System.loadLibrary("opengl32");
    System.loadLibrary("glu32");
    System.loadLibrary("freeglut");
    
    // To use ShowWindow()
    //System.loadLibrary("User32");

  }
  
  /** Load required windows DLL : user32, gdi32, kernel32 */
  public static void loadWindowsDLL() {
    // to invoke getDC() on Windows
    System.loadLibrary("User32"); 
    
    // to invoke ChoosePixelFormat()
    System.loadLibrary("Gdi32");
    
    // to invoke GetLastError()
    System.loadLibrary("Kernel32");
  }

}
