// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface DATEFMT_ENUMPROCA {

    int apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(DATEFMT_ENUMPROCA fi, MemorySession session) {
        return RuntimeHelper.upcallStub(DATEFMT_ENUMPROCA.class, fi, constants$536.DATEFMT_ENUMPROCA$FUNC, session);
    }
    static DATEFMT_ENUMPROCA ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                return (int)constants$536.DATEFMT_ENUMPROCA$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


