// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PHANDLER_ROUTINE {

    int apply(int CtrlType);
    static MemorySegment allocate(PHANDLER_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PHANDLER_ROUTINE.class, fi, constants$570.PHANDLER_ROUTINE$FUNC, session);
    }
    static PHANDLER_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _CtrlType) -> {
            try {
                return (int)constants$570.PHANDLER_ROUTINE$MH.invokeExact((Addressable)symbol, _CtrlType);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

