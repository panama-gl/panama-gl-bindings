// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS4FVMESAPROC {

    void apply(java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLWINDOWPOS4FVMESAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS4FVMESAPROC.class, fi, constants$718.PFNGLWINDOWPOS4FVMESAPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS4FVMESAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$718.PFNGLWINDOWPOS4FVMESAPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


