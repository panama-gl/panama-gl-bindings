// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface __glutCreateWindowWithExit$exitfunc {

    void apply(int _x0);
    static MemorySegment allocate(__glutCreateWindowWithExit$exitfunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(__glutCreateWindowWithExit$exitfunc.class, fi, constants$783.__glutCreateWindowWithExit$exitfunc$FUNC, session);
    }
    static __glutCreateWindowWithExit$exitfunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0) -> {
            try {
                constants$783.__glutCreateWindowWithExit$exitfunc$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

