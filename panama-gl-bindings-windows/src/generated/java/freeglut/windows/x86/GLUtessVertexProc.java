// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GLUtessVertexProc {

    void apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(GLUtessVertexProc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GLUtessVertexProc.class, fi, constants$711.GLUtessVertexProc$FUNC, session);
    }
    static GLUtessVertexProc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                constants$711.GLUtessVertexProc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

