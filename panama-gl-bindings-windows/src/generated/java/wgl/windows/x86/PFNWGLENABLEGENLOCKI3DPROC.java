// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLENABLEGENLOCKI3DPROC {

    int apply(java.lang.foreign.MemoryAddress hDC);
    static MemorySegment allocate(PFNWGLENABLEGENLOCKI3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLENABLEGENLOCKI3DPROC.class, fi, constants$1394.PFNWGLENABLEGENLOCKI3DPROC$FUNC, session);
    }
    static PFNWGLENABLEGENLOCKI3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hDC) -> {
            try {
                return (int)constants$1394.PFNWGLENABLEGENLOCKI3DPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hDC);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


