// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLDESTROYPBUFFEREXTPROC {

    int apply(java.lang.foreign.MemoryAddress hPbuffer);
    static MemorySegment allocate(PFNWGLDESTROYPBUFFEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLDESTROYPBUFFEREXTPROC.class, fi, constants$1381.PFNWGLDESTROYPBUFFEREXTPROC$FUNC, session);
    }
    static PFNWGLDESTROYPBUFFEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hPbuffer) -> {
            try {
                return (int)constants$1381.PFNWGLDESTROYPBUFFEREXTPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hPbuffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


