// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface USER_MARSHAL_SIZING_ROUTINE {

    int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2);
    static MemorySegment allocate(USER_MARSHAL_SIZING_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(USER_MARSHAL_SIZING_ROUTINE.class, fi, constants$825.USER_MARSHAL_SIZING_ROUTINE$FUNC, session);
    }
    static USER_MARSHAL_SIZING_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2) -> {
            try {
                return (int)constants$826.USER_MARSHAL_SIZING_ROUTINE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

