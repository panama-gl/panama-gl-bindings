// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPOINTALONGPATHNVPROC {

    byte apply(int path, int startSegment, int numSegments, float distance, java.lang.foreign.MemoryAddress x, java.lang.foreign.MemoryAddress y, java.lang.foreign.MemoryAddress tangentX, java.lang.foreign.MemoryAddress tangentY);
    static MemorySegment allocate(PFNGLPOINTALONGPATHNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPOINTALONGPATHNVPROC.class, fi, constants$885.PFNGLPOINTALONGPATHNVPROC$FUNC, session);
    }
    static PFNGLPOINTALONGPATHNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path, int _startSegment, int _numSegments, float _distance, java.lang.foreign.MemoryAddress _x, java.lang.foreign.MemoryAddress _y, java.lang.foreign.MemoryAddress _tangentX, java.lang.foreign.MemoryAddress _tangentY) -> {
            try {
                return (byte)constants$885.PFNGLPOINTALONGPATHNVPROC$MH.invokeExact((Addressable)symbol, _path, _startSegment, _numSegments, _distance, (java.lang.foreign.Addressable)_x, (java.lang.foreign.Addressable)_y, (java.lang.foreign.Addressable)_tangentX, (java.lang.foreign.Addressable)_tangentY);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


