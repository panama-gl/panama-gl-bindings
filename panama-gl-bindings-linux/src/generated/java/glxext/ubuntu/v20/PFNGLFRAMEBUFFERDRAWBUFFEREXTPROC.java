// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC {

    void apply(int framebuffer, int mode);
    static MemorySegment allocate(PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC.class, fi, constants$683.PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC$FUNC, session);
    }
    static PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _mode) -> {
            try {
                constants$683.PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


