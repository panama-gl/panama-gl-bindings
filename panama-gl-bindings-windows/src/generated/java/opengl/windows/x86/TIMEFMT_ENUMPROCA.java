// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface TIMEFMT_ENUMPROCA {

    int apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(TIMEFMT_ENUMPROCA fi, MemorySession session) {
        return RuntimeHelper.upcallStub(TIMEFMT_ENUMPROCA.class, fi, constants$542.TIMEFMT_ENUMPROCA$FUNC, session);
    }
    static TIMEFMT_ENUMPROCA ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                return (int)constants$542.TIMEFMT_ENUMPROCA$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


