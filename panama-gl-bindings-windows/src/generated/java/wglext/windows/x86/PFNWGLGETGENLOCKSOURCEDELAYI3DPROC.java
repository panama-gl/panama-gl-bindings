// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLGETGENLOCKSOURCEDELAYI3DPROC {

    int apply(java.lang.foreign.MemoryAddress hDC, java.lang.foreign.MemoryAddress uDelay);
    static MemorySegment allocate(PFNWGLGETGENLOCKSOURCEDELAYI3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLGETGENLOCKSOURCEDELAYI3DPROC.class, fi, constants$1389.PFNWGLGETGENLOCKSOURCEDELAYI3DPROC$FUNC, session);
    }
    static PFNWGLGETGENLOCKSOURCEDELAYI3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hDC, java.lang.foreign.MemoryAddress _uDelay) -> {
            try {
                return (int)constants$1389.PFNWGLGETGENLOCKSOURCEDELAYI3DPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hDC, (java.lang.foreign.Addressable)_uDelay);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


