// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPTHREAD_START_ROUTINE {

    int apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(LPTHREAD_START_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPTHREAD_START_ROUTINE.class, fi, constants$127.LPTHREAD_START_ROUTINE$FUNC, session);
    }
    static LPTHREAD_START_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                return (int)constants$127.LPTHREAD_START_ROUTINE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


