// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutPositionFunc$callback {

    void apply(int _x0, int _x1);
    static MemorySegment allocate(glutPositionFunc$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutPositionFunc$callback.class, fi, constants$786.glutPositionFunc$callback$FUNC, session);
    }
    static glutPositionFunc$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, int __x1) -> {
            try {
                constants$787.glutPositionFunc$callback$MH.invokeExact((Addressable)symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


