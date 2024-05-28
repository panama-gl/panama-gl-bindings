package opengl.macos;

public class NativeLibLoader {
  public static void load() {
    //System.loadLibrary("GLUT.framework/GLUT");
    
    System.load("/System/Library/Frameworks/GLUT.framework/Versions/Current/GLUT");
    
    
    // To make it work in glut_3 directly : 
    /*static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.libraryLookup("GLUT.framework/GLUT", LIBRARY_ARENA)
    .or(SymbolLookup.loaderLookup())
    .or(Linker.nativeLinker().defaultLookup());*/
  }
}
