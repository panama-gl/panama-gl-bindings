// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXGETVIDEOSYNCSGIPROC {

    int apply(java.lang.foreign.MemoryAddress count);
    static MemorySegment allocate(PFNGLXGETVIDEOSYNCSGIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXGETVIDEOSYNCSGIPROC.class, fi, constants$1058.PFNGLXGETVIDEOSYNCSGIPROC$FUNC, session);
    }
    static PFNGLXGETVIDEOSYNCSGIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _count) -> {
            try {
                return (int)constants$1059.PFNGLXGETVIDEOSYNCSGIPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_count);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


