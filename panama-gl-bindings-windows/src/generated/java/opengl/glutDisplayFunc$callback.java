// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutDisplayFunc$callback {

    void apply();
    static MemorySegment allocate(glutDisplayFunc$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutDisplayFunc$callback.class, fi, constants$726.glutDisplayFunc$callback$FUNC, session);
    }
    static glutDisplayFunc$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$726.glutDisplayFunc$callback$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


