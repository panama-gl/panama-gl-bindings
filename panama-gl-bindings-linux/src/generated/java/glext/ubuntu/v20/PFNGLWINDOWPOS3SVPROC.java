// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS3SVPROC {

    void apply(java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLWINDOWPOS3SVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3SVPROC.class, fi, constants$106.PFNGLWINDOWPOS3SVPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS3SVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$106.PFNGLWINDOWPOS3SVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

