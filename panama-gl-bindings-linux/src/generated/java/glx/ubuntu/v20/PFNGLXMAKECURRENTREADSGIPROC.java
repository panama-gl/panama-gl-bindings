// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXMAKECURRENTREADSGIPROC {

    int apply(java.lang.foreign.MemoryAddress dpy, long draw, long read, java.lang.foreign.MemoryAddress ctx);
    static MemorySegment allocate(PFNGLXMAKECURRENTREADSGIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXMAKECURRENTREADSGIPROC.class, fi, constants$1057.PFNGLXMAKECURRENTREADSGIPROC$FUNC, session);
    }
    static PFNGLXMAKECURRENTREADSGIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, long _draw, long _read, java.lang.foreign.MemoryAddress _ctx) -> {
            try {
                return (int)constants$1058.PFNGLXMAKECURRENTREADSGIPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _draw, _read, (java.lang.foreign.Addressable)_ctx);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


