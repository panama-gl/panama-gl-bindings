// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface WAVECALLBACK {

    void apply(java.lang.foreign.MemoryAddress _x0, int _x1, long _x2, long _x3, long _x4);
    static MemorySegment allocate(WAVECALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(WAVECALLBACK.class, fi, constants$625.WAVECALLBACK$FUNC, session);
    }
    static WAVECALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, int __x1, long __x2, long __x3, long __x4) -> {
            try {
                constants$625.WAVECALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, __x3, __x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


