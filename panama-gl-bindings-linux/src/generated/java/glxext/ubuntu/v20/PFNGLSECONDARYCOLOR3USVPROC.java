// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSECONDARYCOLOR3USVPROC {

    void apply(java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLSECONDARYCOLOR3USVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3USVPROC.class, fi, constants$185.PFNGLSECONDARYCOLOR3USVPROC$FUNC, session);
    }
    static PFNGLSECONDARYCOLOR3USVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$185.PFNGLSECONDARYCOLOR3USVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


