// Generated by jextract

package opengl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutMotionFunc$func {

    void apply(int _x0, int _x1);
    static MemorySegment allocate(glutMotionFunc$func fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutMotionFunc$func.class, fi, constants$186.glutMotionFunc$func$FUNC, session);
    }
    static glutMotionFunc$func ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, int __x1) -> {
            try {
                constants$187.glutMotionFunc$func$MH.invokeExact((Addressable)symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

