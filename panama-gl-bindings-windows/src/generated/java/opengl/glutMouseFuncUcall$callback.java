// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutMouseFuncUcall$callback {

    void apply(int _x0, int _x1, int _x2, int _x3, java.lang.foreign.MemoryAddress _x4);
    static MemorySegment allocate(glutMouseFuncUcall$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutMouseFuncUcall$callback.class, fi, constants$803.glutMouseFuncUcall$callback$FUNC, session);
    }
    static glutMouseFuncUcall$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, int __x1, int __x2, int __x3, java.lang.foreign.MemoryAddress __x4) -> {
            try {
                constants$804.glutMouseFuncUcall$callback$MH.invokeExact((Addressable)symbol, __x0, __x1, __x2, __x3, (java.lang.foreign.Addressable)__x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


