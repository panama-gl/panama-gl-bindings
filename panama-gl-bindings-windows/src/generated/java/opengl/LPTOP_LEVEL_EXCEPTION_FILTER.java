// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPTOP_LEVEL_EXCEPTION_FILTER {

    int apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(LPTOP_LEVEL_EXCEPTION_FILTER fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPTOP_LEVEL_EXCEPTION_FILTER.class, fi, constants$157.LPTOP_LEVEL_EXCEPTION_FILTER$FUNC, session);
    }
    static LPTOP_LEVEL_EXCEPTION_FILTER ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                return (int)constants$158.LPTOP_LEVEL_EXCEPTION_FILTER$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


