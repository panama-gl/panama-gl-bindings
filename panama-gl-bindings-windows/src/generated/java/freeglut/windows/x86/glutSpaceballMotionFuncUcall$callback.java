// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutSpaceballMotionFuncUcall$callback {

    void apply(int _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3);
    static MemorySegment allocate(glutSpaceballMotionFuncUcall$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutSpaceballMotionFuncUcall$callback.class, fi, constants$808.glutSpaceballMotionFuncUcall$callback$FUNC, session);
    }
    static glutSpaceballMotionFuncUcall$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3) -> {
            try {
                constants$809.glutSpaceballMotionFuncUcall$callback$MH.invokeExact((Addressable)symbol, __x0, __x1, __x2, (java.lang.foreign.Addressable)__x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


