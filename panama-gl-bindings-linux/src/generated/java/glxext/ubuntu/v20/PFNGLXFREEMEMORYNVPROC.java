// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXFREEMEMORYNVPROC {

    void apply(java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLXFREEMEMORYNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXFREEMEMORYNVPROC.class, fi, constants$1060.PFNGLXFREEMEMORYNVPROC$FUNC, session);
    }
    static PFNGLXFREEMEMORYNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$1060.PFNGLXFREEMEMORYNVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


