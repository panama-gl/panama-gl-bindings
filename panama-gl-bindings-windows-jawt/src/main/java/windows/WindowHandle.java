package windows;

import java.awt.Component;
import java.lang.foreign.Addressable;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;
import jawt.windows.x86.JNIEnv_;
import jawt.windows.x86.jawt;
import jawt.windows.x86.jawt_h;

public class WindowHandle {
  MemorySession scope;
  SegmentAllocator allocator;
  
  public int getHandle(Component c) {
    
    Addressable jawt = allocator.allocateUtf8String("JAWT_GetAWT");
    
    JNIEnv_ env = new JNIEnv_();
    jawt awt = new jawt();
    
    jawt_h.JAWT_GetAWT(env, awt);
    
    return -1;
  }
  
  public WindowHandle() {
    try {
        scope = MemorySession.openImplicit();
      allocator = SegmentAllocator.newNativeArena(scope);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public MemorySession getScope() {
    return scope;
  }

  public SegmentAllocator getAllocator() {
    return allocator;
  }
}
