// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM3I64NVPROC {

    void apply(int program, int location, long x, long y, long z);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM3I64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3I64NVPROC.class, fi, constants$547.PFNGLPROGRAMUNIFORM3I64NVPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM3I64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, long _x, long _y, long _z) -> {
            try {
                constants$547.PFNGLPROGRAMUNIFORM3I64NVPROC$MH.invokeExact((Addressable)symbol, _program, _location, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


