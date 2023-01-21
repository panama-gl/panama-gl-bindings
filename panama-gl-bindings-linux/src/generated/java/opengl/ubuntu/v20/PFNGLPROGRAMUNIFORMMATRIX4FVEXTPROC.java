// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROC {

    void apply(int program, int location, int count, byte transpose, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROC.class, fi, constants$578.PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _count, byte _transpose, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$578.PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROC$MH.invokeExact((Addressable)symbol, _program, _location, _count, _transpose, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


