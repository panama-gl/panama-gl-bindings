// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GLUtessEdgeFlagDataProc {

    void apply(byte _x0, java.lang.foreign.MemoryAddress _x1);
    static MemorySegment allocate(GLUtessEdgeFlagDataProc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GLUtessEdgeFlagDataProc.class, fi, constants$713.GLUtessEdgeFlagDataProc$FUNC, session);
    }
    static GLUtessEdgeFlagDataProc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte __x0, java.lang.foreign.MemoryAddress __x1) -> {
            try {
                constants$713.GLUtessEdgeFlagDataProc$MH.invokeExact((Addressable)symbol, __x0, (java.lang.foreign.Addressable)__x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


