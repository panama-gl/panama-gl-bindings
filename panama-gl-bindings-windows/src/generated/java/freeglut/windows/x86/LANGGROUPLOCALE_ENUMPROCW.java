// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LANGGROUPLOCALE_ENUMPROCW {

    int apply(int _x0, int _x1, java.lang.foreign.MemoryAddress _x2, long _x3);
    static MemorySegment allocate(LANGGROUPLOCALE_ENUMPROCW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LANGGROUPLOCALE_ENUMPROCW.class, fi, constants$543.LANGGROUPLOCALE_ENUMPROCW$FUNC, session);
    }
    static LANGGROUPLOCALE_ENUMPROCW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, int __x1, java.lang.foreign.MemoryAddress __x2, long __x3) -> {
            try {
                return (int)constants$543.LANGGROUPLOCALE_ENUMPROCW$MH.invokeExact((Addressable)symbol, __x0, __x1, (java.lang.foreign.Addressable)__x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


