// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface DATEFMT_ENUMPROCEXW {

    int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
    static MemorySegment allocate(DATEFMT_ENUMPROCEXW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(DATEFMT_ENUMPROCEXW.class, fi, constants$545.DATEFMT_ENUMPROCEXW$FUNC, session);
    }
    static DATEFMT_ENUMPROCEXW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
            try {
                return (int)constants$545.DATEFMT_ENUMPROCEXW$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


