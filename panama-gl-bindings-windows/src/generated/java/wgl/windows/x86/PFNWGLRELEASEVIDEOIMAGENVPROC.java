// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLRELEASEVIDEOIMAGENVPROC {

    int apply(java.lang.foreign.MemoryAddress hPbuffer, int iVideoBuffer);
    static MemorySegment allocate(PFNWGLRELEASEVIDEOIMAGENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLRELEASEVIDEOIMAGENVPROC.class, fi, constants$1413.PFNWGLRELEASEVIDEOIMAGENVPROC$FUNC, session);
    }
    static PFNWGLRELEASEVIDEOIMAGENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hPbuffer, int _iVideoBuffer) -> {
            try {
                return (int)constants$1413.PFNWGLRELEASEVIDEOIMAGENVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hPbuffer, _iVideoBuffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


