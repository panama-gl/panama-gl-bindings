// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutTimerFunc$callback {

    void apply(int _x0);
    static MemorySegment allocate(glutTimerFunc$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutTimerFunc$callback.class, fi, constants$723.glutTimerFunc$callback$FUNC, session);
    }
    static glutTimerFunc$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0) -> {
            try {
                constants$723.glutTimerFunc$callback$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


