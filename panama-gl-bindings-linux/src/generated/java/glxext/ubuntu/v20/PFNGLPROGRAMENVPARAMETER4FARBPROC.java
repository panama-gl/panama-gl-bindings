// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMENVPARAMETER4FARBPROC {

    void apply(int target, int index, float x, float y, float z, float w);
    static MemorySegment allocate(PFNGLPROGRAMENVPARAMETER4FARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMENVPARAMETER4FARBPROC.class, fi, constants$410.PFNGLPROGRAMENVPARAMETER4FARBPROC$FUNC, session);
    }
    static PFNGLPROGRAMENVPARAMETER4FARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, float _x, float _y, float _z, float _w) -> {
            try {
                constants$410.PFNGLPROGRAMENVPARAMETER4FARBPROC$MH.invokeExact((Addressable)symbol, _target, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


