// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutKeyboardFunc$callback {

    void apply(byte _x0, int _x1, int _x2);
    static MemorySegment allocate(glutKeyboardFunc$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutKeyboardFunc$callback.class, fi, constants$1368.glutKeyboardFunc$callback$FUNC, session);
    }
    static glutKeyboardFunc$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte __x0, int __x1, int __x2) -> {
            try {
                constants$1368.glutKeyboardFunc$callback$MH.invokeExact((Addressable)symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


