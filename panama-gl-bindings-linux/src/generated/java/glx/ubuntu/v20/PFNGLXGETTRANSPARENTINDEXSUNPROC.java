// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXGETTRANSPARENTINDEXSUNPROC {

    int apply(java.lang.foreign.MemoryAddress dpy, long overlay, long underlay, java.lang.foreign.MemoryAddress pTransparentIndex);
    static MemorySegment allocate(PFNGLXGETTRANSPARENTINDEXSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXGETTRANSPARENTINDEXSUNPROC.class, fi, constants$1059.PFNGLXGETTRANSPARENTINDEXSUNPROC$FUNC, session);
    }
    static PFNGLXGETTRANSPARENTINDEXSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, long _overlay, long _underlay, java.lang.foreign.MemoryAddress _pTransparentIndex) -> {
            try {
                return (int)constants$1059.PFNGLXGETTRANSPARENTINDEXSUNPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _overlay, _underlay, (java.lang.foreign.Addressable)_pTransparentIndex);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

