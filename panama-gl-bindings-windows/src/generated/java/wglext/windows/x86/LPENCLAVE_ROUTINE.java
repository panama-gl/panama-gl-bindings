// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPENCLAVE_ROUTINE {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(LPENCLAVE_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPENCLAVE_ROUTINE.class, fi, constants$128.LPENCLAVE_ROUTINE$FUNC, session);
    }
    static LPENCLAVE_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$128.LPENCLAVE_ROUTINE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


