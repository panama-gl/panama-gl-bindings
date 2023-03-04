// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PTHREAD_START_ROUTINE {

    int apply(java.lang.foreign.MemoryAddress lpThreadParameter);
    static MemorySegment allocate(PTHREAD_START_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PTHREAD_START_ROUTINE.class, fi, constants$130.PTHREAD_START_ROUTINE$FUNC, session);
    }
    static PTHREAD_START_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _lpThreadParameter) -> {
            try {
                return (int)constants$130.PTHREAD_START_ROUTINE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_lpThreadParameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


