// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface CODEPAGE_ENUMPROCA {

    int apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(CODEPAGE_ENUMPROCA fi, MemorySession session) {
        return RuntimeHelper.upcallStub(CODEPAGE_ENUMPROCA.class, fi, constants$541.CODEPAGE_ENUMPROCA$FUNC, session);
    }
    static CODEPAGE_ENUMPROCA ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                return (int)constants$541.CODEPAGE_ENUMPROCA$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


