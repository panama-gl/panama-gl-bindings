// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface USER_MARSHAL_UNMARSHALLING_ROUTINE {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
    static MemorySegment allocate(USER_MARSHAL_UNMARSHALLING_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(USER_MARSHAL_UNMARSHALLING_ROUTINE.class, fi, constants$826.USER_MARSHAL_UNMARSHALLING_ROUTINE$FUNC, session);
    }
    static USER_MARSHAL_UNMARSHALLING_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$826.USER_MARSHAL_UNMARSHALLING_ROUTINE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


