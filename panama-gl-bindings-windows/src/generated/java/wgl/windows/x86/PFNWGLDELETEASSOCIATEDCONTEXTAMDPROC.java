// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLDELETEASSOCIATEDCONTEXTAMDPROC {

    int apply(java.lang.foreign.MemoryAddress hglrc);
    static MemorySegment allocate(PFNWGLDELETEASSOCIATEDCONTEXTAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLDELETEASSOCIATEDCONTEXTAMDPROC.class, fi, constants$1385.PFNWGLDELETEASSOCIATEDCONTEXTAMDPROC$FUNC, session);
    }
    static PFNWGLDELETEASSOCIATEDCONTEXTAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hglrc) -> {
            try {
                return (int)constants$1385.PFNWGLDELETEASSOCIATEDCONTEXTAMDPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hglrc);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


