import java.util.Arrays;
import cgl.macos.v10_15_7.cgl_h;
import java.lang.foreign.MemorySession;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

// https://stackoverflow.com/questions/11383510/setting-up-an-opengl-context-with-cgl-on-mac-os-x
// https://developer.apple.com/library/archive/documentation/GraphicsImaging/Conceptual/OpenGL-MacProgGuide/opengl_offscreen/opengl_offscreen.html
// http://renderingpipeline.com/2012/05/windowless-opengl-on-macos-x/

public class TestCGL {
/* int[] numPixelFormats = new int[1];
  CGLChoosePixelFormat(attributes, 0, 0, numPixelFormats);

  int[] pixelFormat = new int[1];
  CGLChoosePixelFormat(attributes, 1, pixelFormat, numPixelFormats);

  // Describe the pixel format to get the maximum number of samples per pixel
  int[] maxSamples = new int[1];
  CGLDescribePixelFormat(pixelFormat[0], 0, CGL.kCGLPFAMaximumSampleBuffers, maxSamples);

  // Create an OpenGL context
  PointerByReference context = new PointerByReference();
  CGLCreateContext(pixelFormat[0], 0, context);

  // ...

  // Destroy the pixel format and the OpenGL context when you are done with them
  CGLDestroyPixelFormat(pixelFormat[0]);
  CGLDestroyContext(context.getValue());*/
  
  
  public static void main(String[] args) {
    // Manually load CGL
    //System.load("/System/Library/Frameworks/GLUT.framework/Versions/Current/GLUT");
    System.load("/System/Library/Frameworks/GLUT.framework/Versions/Current/GLUT");
    
    MemorySession scope = MemorySession.openConfined();
    SegmentAllocator allocator = SegmentAllocator.newNativeArena(scope);
    
    /* 
     CGLPixelFormatAttribute attributes[4] = {
      kCGLPFAAccelerated,   // no software rendering
      kCGLPFAOpenGLProfile, // core profile with the version stated below
      (CGLPixelFormatAttribute) kCGLOGLPVersion_3_2_Core,
      (CGLPixelFormatAttribute) 0
    };

    CGLPixelFormatObj pix;
    CGLError errorCode;
    GLint num; // stores the number of possible pixel formats
     */
    

    int[] at = new int[4];
    at[0] = cgl_h.kCGLPFAAccelerated();
    at[1] = cgl_h.kCGLPFAOpenGLProfile();
    at[2] = cgl_h.kCGLOGLPVersion_3_2_Core();
    at[3] = 0;
    
    MemorySegment attribs = allocator.allocateArray(cgl_h.C_INT, at);
    MemorySegment pix = allocator.allocateArray(cgl_h.C_INT, new int[1]);
    
    //int[] pixFormats = new int[1];
    MemorySegment npix = allocator.allocateArray(cgl_h.C_INT, new int[1]);
    
    cgl_h.CGLChoosePixelFormat(attribs, pix, npix);

    //System.out.println(Arrays.toString(attribs.toArray()));
    //System.out.println(Arrays.toString(pix.toIntArray()));
    //System.out.println(Arrays.toString(npix.toIntArray()));

    
    /**
     * CGLContextObj context;
     */
    MemorySegment c_share = allocator.allocateUtf8String("");
    MemorySegment c_ctx = allocator.allocateUtf8String("");
    cgl_h.CGLCreateContext(pix, c_share, c_ctx) ;
    
    //System.out.println(Arrays.toString(pix.toIntArray()));
    //System.out.println(Arrays.toString(npix.toIntArray()));

    //c_ctx.
    
    System.out.println("I'm done!!");

  }
  
  //public MemorySegment alloc(String value) {
  //  return CLinker.toCString(value, scope);
 // }

}
