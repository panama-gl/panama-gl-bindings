// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM2I64NVPROC {

    void apply(int program, int location, long x, long y);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM2I64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2I64NVPROC.class, fi, constants$462.PFNGLPROGRAMUNIFORM2I64NVPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM2I64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, long _x, long _y) -> {
            try {
                constants$462.PFNGLPROGRAMUNIFORM2I64NVPROC$MH.invokeExact((Addressable)symbol, _program, _location, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


