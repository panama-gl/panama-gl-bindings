// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLGETDIGITALVIDEOPARAMETERSI3DPROC {

    int apply(java.lang.foreign.MemoryAddress hDC, int iAttribute, java.lang.foreign.MemoryAddress piValue);
    static MemorySegment allocate(PFNWGLGETDIGITALVIDEOPARAMETERSI3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLGETDIGITALVIDEOPARAMETERSI3DPROC.class, fi, constants$1392.PFNWGLGETDIGITALVIDEOPARAMETERSI3DPROC$FUNC, session);
    }
    static PFNWGLGETDIGITALVIDEOPARAMETERSI3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hDC, int _iAttribute, java.lang.foreign.MemoryAddress _piValue) -> {
            try {
                return (int)constants$1392.PFNWGLGETDIGITALVIDEOPARAMETERSI3DPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hDC, _iAttribute, (java.lang.foreign.Addressable)_piValue);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


