package win32;

import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.io.File;

public class Win32 {
  public static int CANT_LOAD_GET_AWT_PROC = -6;
  
  public static boolean validHandle(int value) {
    return value>0;
  }
  
  public static native int getWindowHandle(Component c);
  
  public static int getParentWindowHandle(Component c) {
      Container parent = c.getParent();
      
      int handle = -1;
      
      while(parent!=null) {
        if(parent instanceof Frame) {
          Frame f = (Frame)parent;
          handle = Win32.getWindowHandle(f);
          break;
        }
        else {
          parent = parent.getParent();
        }
      }
      return handle;
  }
  
  public static void loadLibrary(String path) {
    File f = new File(path);
    System.load(f.getAbsolutePath());
  }
}
