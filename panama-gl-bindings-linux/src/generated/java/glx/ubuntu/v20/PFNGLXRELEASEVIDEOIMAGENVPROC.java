// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXRELEASEVIDEOIMAGENVPROC {

    int apply(java.lang.foreign.MemoryAddress dpy, long pbuf);
    static MemorySegment allocate(PFNGLXRELEASEVIDEOIMAGENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXRELEASEVIDEOIMAGENVPROC.class, fi, constants$1044.PFNGLXRELEASEVIDEOIMAGENVPROC$FUNC, session);
    }
    static PFNGLXRELEASEVIDEOIMAGENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, long _pbuf) -> {
            try {
                return (int)constants$1045.PFNGLXRELEASEVIDEOIMAGENVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _pbuf);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


