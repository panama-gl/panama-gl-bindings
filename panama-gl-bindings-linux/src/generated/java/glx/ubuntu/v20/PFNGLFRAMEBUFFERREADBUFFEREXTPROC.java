// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAMEBUFFERREADBUFFEREXTPROC {

    void apply(int framebuffer, int mode);
    static MemorySegment allocate(PFNGLFRAMEBUFFERREADBUFFEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERREADBUFFEREXTPROC.class, fi, constants$684.PFNGLFRAMEBUFFERREADBUFFEREXTPROC$FUNC, session);
    }
    static PFNGLFRAMEBUFFERREADBUFFEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _mode) -> {
            try {
                constants$684.PFNGLFRAMEBUFFERREADBUFFEREXTPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

