// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDELETEFRAMEBUFFERSPROC {

    void apply(int n, java.lang.foreign.MemoryAddress framebuffers);
    static MemorySegment allocate(PFNGLDELETEFRAMEBUFFERSPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDELETEFRAMEBUFFERSPROC.class, fi, constants$168.PFNGLDELETEFRAMEBUFFERSPROC$FUNC, session);
    }
    static PFNGLDELETEFRAMEBUFFERSPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _framebuffers) -> {
            try {
                constants$168.PFNGLDELETEFRAMEBUFFERSPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_framebuffers);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


