// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PENCLAVE_ROUTINE {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress lpThreadParameter);
    static MemorySegment allocate(PENCLAVE_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PENCLAVE_ROUTINE.class, fi, constants$128.PENCLAVE_ROUTINE$FUNC, session);
    }
    static PENCLAVE_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _lpThreadParameter) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$128.PENCLAVE_ROUTINE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_lpThreadParameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

