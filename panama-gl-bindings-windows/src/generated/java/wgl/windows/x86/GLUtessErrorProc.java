// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GLUtessErrorProc {

    void apply(int _x0);
    static MemorySegment allocate(GLUtessErrorProc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GLUtessErrorProc.class, fi, constants$1364.GLUtessErrorProc$FUNC, session);
    }
    static GLUtessErrorProc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0) -> {
            try {
                constants$1365.GLUtessErrorProc$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


