// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXDELAYBEFORESWAPNVPROC {

    int apply(java.lang.foreign.MemoryAddress dpy, long drawable, float seconds);
    static MemorySegment allocate(PFNGLXDELAYBEFORESWAPNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXDELAYBEFORESWAPNVPROC.class, fi, constants$1039.PFNGLXDELAYBEFORESWAPNVPROC$FUNC, session);
    }
    static PFNGLXDELAYBEFORESWAPNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, long _drawable, float _seconds) -> {
            try {
                return (int)constants$1039.PFNGLXDELAYBEFORESWAPNVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _drawable, _seconds);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


