// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPOCNCONNPROCW {

    long apply(long _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
    static MemorySegment allocate(LPOCNCONNPROCW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPOCNCONNPROCW.class, fi, constants$885.LPOCNCONNPROCW$FUNC, session);
    }
    static LPOCNCONNPROCW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
            try {
                return (long)constants$885.LPOCNCONNPROCW$MH.invokeExact((Addressable)symbol, __x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


