package win32;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class WinHandleDemo {

  public static void main(String[] args) {
    String javaLibPathKey = "java.library.path";
    String javaLibraryPath = System.getProperty(javaLibPathKey);
    System.out.println("java lib path : " + javaLibraryPath);
    
    
    // Load handle retrieval library
    Win32.loadLibrary("./src/main/resources/Win32.dll");
    
    // Create a frame
    JFrame f = new JFrame();
    f.setBounds(0, 0, 50, 50);
    f.pack();
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent ev) {
        System.exit(0);
      }
    });
    
    // Get window handle
    int i = Win32.getWindowHandle(f);
    
    if(Win32.validHandle(i)) {
      System.out.println("Window handle : " + i);
    }
    else {
      System.out.println("Invalid handle");
    }
  }

}
