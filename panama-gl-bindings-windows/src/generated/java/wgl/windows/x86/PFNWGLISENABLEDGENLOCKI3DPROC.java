// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLISENABLEDGENLOCKI3DPROC {

    int apply(java.lang.foreign.MemoryAddress hDC, java.lang.foreign.MemoryAddress pFlag);
    static MemorySegment allocate(PFNWGLISENABLEDGENLOCKI3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLISENABLEDGENLOCKI3DPROC.class, fi, constants$1395.PFNWGLISENABLEDGENLOCKI3DPROC$FUNC, session);
    }
    static PFNWGLISENABLEDGENLOCKI3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hDC, java.lang.foreign.MemoryAddress _pFlag) -> {
            try {
                return (int)constants$1395.PFNWGLISENABLEDGENLOCKI3DPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hDC, (java.lang.foreign.Addressable)_pFlag);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

