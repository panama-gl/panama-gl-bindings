// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLRECTXVOESPROC {

    void apply(java.lang.foreign.MemoryAddress v1, java.lang.foreign.MemoryAddress v2);
    static MemorySegment allocate(PFNGLRECTXVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLRECTXVOESPROC.class, fi, constants$602.PFNGLRECTXVOESPROC$FUNC, session);
    }
    static PFNGLRECTXVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _v1, java.lang.foreign.MemoryAddress _v2) -> {
            try {
                constants$603.PFNGLRECTXVOESPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_v1, (java.lang.foreign.Addressable)_v2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


