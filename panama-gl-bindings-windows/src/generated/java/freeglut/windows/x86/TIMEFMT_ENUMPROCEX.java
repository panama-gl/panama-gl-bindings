// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface TIMEFMT_ENUMPROCEX {

    int apply(java.lang.foreign.MemoryAddress _x0, long _x1);
    static MemorySegment allocate(TIMEFMT_ENUMPROCEX fi, MemorySession session) {
        return RuntimeHelper.upcallStub(TIMEFMT_ENUMPROCEX.class, fi, constants$566.TIMEFMT_ENUMPROCEX$FUNC, session);
    }
    static TIMEFMT_ENUMPROCEX ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, long __x1) -> {
            try {
                return (int)constants$567.TIMEFMT_ENUMPROCEX$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


