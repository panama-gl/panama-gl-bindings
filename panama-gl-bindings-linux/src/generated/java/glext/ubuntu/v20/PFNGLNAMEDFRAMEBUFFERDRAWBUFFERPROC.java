// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC {

    void apply(int framebuffer, int buf);
    static MemorySegment allocate(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC.class, fi, constants$279.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC$FUNC, session);
    }
    static PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _buf) -> {
            try {
                constants$279.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _buf);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


