// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface DRIVERPROC {

    long apply(long _x0, java.lang.foreign.MemoryAddress _x1, int _x2, long _x3, long _x4);
    static MemorySegment allocate(DRIVERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(DRIVERPROC.class, fi, constants$617.DRIVERPROC$FUNC, session);
    }
    static DRIVERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long __x0, java.lang.foreign.MemoryAddress __x1, int __x2, long __x3, long __x4) -> {
            try {
                return (long)constants$617.DRIVERPROC$MH.invokeExact((Addressable)symbol, __x0, (java.lang.foreign.Addressable)__x1, __x2, __x3, __x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


