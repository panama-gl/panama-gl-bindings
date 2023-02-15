// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDFRAMEBUFFERPROC {

    void apply(int target, int framebuffer);
    static MemorySegment allocate(PFNGLBINDFRAMEBUFFERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAMEBUFFERPROC.class, fi, constants$253.PFNGLBINDFRAMEBUFFERPROC$FUNC, session);
    }
    static PFNGLBINDFRAMEBUFFERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _framebuffer) -> {
            try {
                constants$253.PFNGLBINDFRAMEBUFFERPROC$MH.invokeExact((Addressable)symbol, _target, _framebuffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


