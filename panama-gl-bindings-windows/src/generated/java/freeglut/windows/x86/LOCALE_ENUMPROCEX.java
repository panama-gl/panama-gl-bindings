// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LOCALE_ENUMPROCEX {

    int apply(java.lang.foreign.MemoryAddress _x0, int _x1, long _x2);
    static MemorySegment allocate(LOCALE_ENUMPROCEX fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LOCALE_ENUMPROCEX.class, fi, constants$567.LOCALE_ENUMPROCEX$FUNC, session);
    }
    static LOCALE_ENUMPROCEX ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, int __x1, long __x2) -> {
            try {
                return (int)constants$567.LOCALE_ENUMPROCEX$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


