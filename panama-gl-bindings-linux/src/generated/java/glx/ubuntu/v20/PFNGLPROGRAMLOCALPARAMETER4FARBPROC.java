// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMLOCALPARAMETER4FARBPROC {

    void apply(int target, int index, float x, float y, float z, float w);
    static MemorySegment allocate(PFNGLPROGRAMLOCALPARAMETER4FARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMLOCALPARAMETER4FARBPROC.class, fi, constants$411.PFNGLPROGRAMLOCALPARAMETER4FARBPROC$FUNC, session);
    }
    static PFNGLPROGRAMLOCALPARAMETER4FARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, float _x, float _y, float _z, float _w) -> {
            try {
                constants$411.PFNGLPROGRAMLOCALPARAMETER4FARBPROC$MH.invokeExact((Addressable)symbol, _target, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


