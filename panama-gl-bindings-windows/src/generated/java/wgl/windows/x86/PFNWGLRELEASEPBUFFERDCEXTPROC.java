// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLRELEASEPBUFFERDCEXTPROC {

    int apply(java.lang.foreign.MemoryAddress hPbuffer, java.lang.foreign.MemoryAddress hDC);
    static MemorySegment allocate(PFNWGLRELEASEPBUFFERDCEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLRELEASEPBUFFERDCEXTPROC.class, fi, constants$1389.PFNWGLRELEASEPBUFFERDCEXTPROC$FUNC, session);
    }
    static PFNWGLRELEASEPBUFFERDCEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hPbuffer, java.lang.foreign.MemoryAddress _hDC) -> {
            try {
                return (int)constants$1389.PFNWGLRELEASEPBUFFERDCEXTPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hPbuffer, (java.lang.foreign.Addressable)_hDC);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

