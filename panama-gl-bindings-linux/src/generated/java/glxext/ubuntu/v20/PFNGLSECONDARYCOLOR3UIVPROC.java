// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSECONDARYCOLOR3UIVPROC {

    void apply(java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLSECONDARYCOLOR3UIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3UIVPROC.class, fi, constants$185.PFNGLSECONDARYCOLOR3UIVPROC$FUNC, session);
    }
    static PFNGLSECONDARYCOLOR3UIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$185.PFNGLSECONDARYCOLOR3UIVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


