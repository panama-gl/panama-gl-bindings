// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXGETAGPOFFSETMESAPROC {

    int apply(java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLXGETAGPOFFSETMESAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXGETAGPOFFSETMESAPROC.class, fi, constants$1034.PFNGLXGETAGPOFFSETMESAPROC$FUNC, session);
    }
    static PFNGLXGETAGPOFFSETMESAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                return (int)constants$1034.PFNGLXGETAGPOFFSETMESAPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


