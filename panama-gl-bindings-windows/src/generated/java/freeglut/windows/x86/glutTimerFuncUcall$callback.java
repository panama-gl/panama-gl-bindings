// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutTimerFuncUcall$callback {

    void apply(int _x0, java.lang.foreign.MemoryAddress _x1);
    static MemorySegment allocate(glutTimerFuncUcall$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutTimerFuncUcall$callback.class, fi, constants$800.glutTimerFuncUcall$callback$FUNC, session);
    }
    static glutTimerFuncUcall$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, java.lang.foreign.MemoryAddress __x1) -> {
            try {
                constants$800.glutTimerFuncUcall$callback$MH.invokeExact((Addressable)symbol, __x0, (java.lang.foreign.Addressable)__x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

