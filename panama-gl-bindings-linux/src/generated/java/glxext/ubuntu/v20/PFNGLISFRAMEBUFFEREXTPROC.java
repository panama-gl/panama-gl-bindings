// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISFRAMEBUFFEREXTPROC {

    byte apply(int framebuffer);
    static MemorySegment allocate(PFNGLISFRAMEBUFFEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISFRAMEBUFFEREXTPROC.class, fi, constants$712.PFNGLISFRAMEBUFFEREXTPROC$FUNC, session);
    }
    static PFNGLISFRAMEBUFFEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer) -> {
            try {
                return (byte)constants$712.PFNGLISFRAMEBUFFEREXTPROC$MH.invokeExact((Addressable)symbol, _framebuffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


