// Generated by jextract

package opengl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutSpecialFunc$func {

    void apply(int _x0, int _x1, int _x2);
    static MemorySegment allocate(glutSpecialFunc$func fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutSpecialFunc$func.class, fi, constants$190.glutSpecialFunc$func$FUNC, session);
    }
    static glutSpecialFunc$func ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, int __x1, int __x2) -> {
            try {
                constants$190.glutSpecialFunc$func$MH.invokeExact((Addressable)symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


