// Generated by jextract

package jawt.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface funopen$x2 {

    long apply(java.lang.foreign.MemoryAddress _x0, long _x1, int _x2);
    static MemorySegment allocate(funopen$x2 fi, MemorySession session) {
        return RuntimeHelper.upcallStub(funopen$x2.class, fi, constants$15.funopen$x2$FUNC, session);
    }
    static funopen$x2 ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, long __x1, int __x2) -> {
            try {
                return (long)constants$15.funopen$x2$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

