// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutDisplayFuncUcall$callback {

    void apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(glutDisplayFuncUcall$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutDisplayFuncUcall$callback.class, fi, constants$803.glutDisplayFuncUcall$callback$FUNC, session);
    }
    static glutDisplayFuncUcall$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                constants$803.glutDisplayFuncUcall$callback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


