// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface MFENUMPROC {

    int apply(java.lang.foreign.MemoryAddress hdc, java.lang.foreign.MemoryAddress lpht, java.lang.foreign.MemoryAddress lpMR, int nObj, long param);
    static MemorySegment allocate(MFENUMPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(MFENUMPROC.class, fi, constants$385.MFENUMPROC$FUNC, session);
    }
    static MFENUMPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hdc, java.lang.foreign.MemoryAddress _lpht, java.lang.foreign.MemoryAddress _lpMR, int _nObj, long _param) -> {
            try {
                return (int)constants$385.MFENUMPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hdc, (java.lang.foreign.Addressable)_lpht, (java.lang.foreign.Addressable)_lpMR, _nObj, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


