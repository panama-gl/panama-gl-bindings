// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXQUERYCONTEXTPROC {

    int apply(java.lang.foreign.MemoryAddress dpy, java.lang.foreign.MemoryAddress ctx, int attribute, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLXQUERYCONTEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYCONTEXTPROC.class, fi, constants$1026.PFNGLXQUERYCONTEXTPROC$FUNC, session);
    }
    static PFNGLXQUERYCONTEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, java.lang.foreign.MemoryAddress _ctx, int _attribute, java.lang.foreign.MemoryAddress _value) -> {
            try {
                return (int)constants$1026.PFNGLXQUERYCONTEXTPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, (java.lang.foreign.Addressable)_ctx, _attribute, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


