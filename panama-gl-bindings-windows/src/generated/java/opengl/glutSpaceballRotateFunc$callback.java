// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutSpaceballRotateFunc$callback {

    void apply(int _x0, int _x1, int _x2);
    static MemorySegment allocate(glutSpaceballRotateFunc$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutSpaceballRotateFunc$callback.class, fi, constants$732.glutSpaceballRotateFunc$callback$FUNC, session);
    }
    static glutSpaceballRotateFunc$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, int __x1, int __x2) -> {
            try {
                constants$732.glutSpaceballRotateFunc$callback$MH.invokeExact((Addressable)symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


