// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLBINDVIDEOIMAGENVPROC {

    int apply(java.lang.foreign.MemoryAddress hVideoDevice, java.lang.foreign.MemoryAddress hPbuffer, int iVideoBuffer);
    static MemorySegment allocate(PFNWGLBINDVIDEOIMAGENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLBINDVIDEOIMAGENVPROC.class, fi, constants$1404.PFNWGLBINDVIDEOIMAGENVPROC$FUNC, session);
    }
    static PFNWGLBINDVIDEOIMAGENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hVideoDevice, java.lang.foreign.MemoryAddress _hPbuffer, int _iVideoBuffer) -> {
            try {
                return (int)constants$1404.PFNWGLBINDVIDEOIMAGENVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hVideoDevice, (java.lang.foreign.Addressable)_hPbuffer, _iVideoBuffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


