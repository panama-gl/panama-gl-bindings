// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXQUERYFRAMECOUNTNVPROC {

    int apply(java.lang.foreign.MemoryAddress dpy, int screen, java.lang.foreign.MemoryAddress count);
    static MemorySegment allocate(PFNGLXQUERYFRAMECOUNTNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYFRAMECOUNTNVPROC.class, fi, constants$1041.PFNGLXQUERYFRAMECOUNTNVPROC$FUNC, session);
    }
    static PFNGLXQUERYFRAMECOUNTNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, int _screen, java.lang.foreign.MemoryAddress _count) -> {
            try {
                return (int)constants$1041.PFNGLXQUERYFRAMECOUNTNVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _screen, (java.lang.foreign.Addressable)_count);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


