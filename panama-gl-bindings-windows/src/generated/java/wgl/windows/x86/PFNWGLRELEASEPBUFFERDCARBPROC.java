// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLRELEASEPBUFFERDCARBPROC {

    int apply(java.lang.foreign.MemoryAddress hPbuffer, java.lang.foreign.MemoryAddress hDC);
    static MemorySegment allocate(PFNWGLRELEASEPBUFFERDCARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLRELEASEPBUFFERDCARBPROC.class, fi, constants$1380.PFNWGLRELEASEPBUFFERDCARBPROC$FUNC, session);
    }
    static PFNWGLRELEASEPBUFFERDCARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hPbuffer, java.lang.foreign.MemoryAddress _hDC) -> {
            try {
                return (int)constants$1380.PFNWGLRELEASEPBUFFERDCARBPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hPbuffer, (java.lang.foreign.Addressable)_hDC);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

