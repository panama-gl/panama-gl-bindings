// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLGENLOCKSOURCEEDGEI3DPROC {

    int apply(java.lang.foreign.MemoryAddress hDC, int uEdge);
    static MemorySegment allocate(PFNWGLGENLOCKSOURCEEDGEI3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLGENLOCKSOURCEEDGEI3DPROC.class, fi, constants$1387.PFNWGLGENLOCKSOURCEEDGEI3DPROC$FUNC, session);
    }
    static PFNWGLGENLOCKSOURCEEDGEI3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hDC, int _uEdge) -> {
            try {
                return (int)constants$1387.PFNWGLGENLOCKSOURCEEDGEI3DPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hDC, _uEdge);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


