// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC {

    void apply(int gpu, int framebuffer, int start, int count, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC.class, fi, constants$755.PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$FUNC, session);
    }
    static PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _gpu, int _framebuffer, int _start, int _count, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$755.PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$MH.invokeExact((Addressable)symbol, _gpu, _framebuffer, _start, _count, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


