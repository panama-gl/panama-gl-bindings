// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXJOINSWAPGROUPSGIXPROC {

    void apply(java.lang.foreign.MemoryAddress dpy, long drawable, long member);
    static MemorySegment allocate(PFNGLXJOINSWAPGROUPSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXJOINSWAPGROUPSGIXPROC.class, fi, constants$1055.PFNGLXJOINSWAPGROUPSGIXPROC$FUNC, session);
    }
    static PFNGLXJOINSWAPGROUPSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, long _drawable, long _member) -> {
            try {
                constants$1055.PFNGLXJOINSWAPGROUPSGIXPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _drawable, _member);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


