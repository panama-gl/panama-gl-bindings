// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM1I64NVPROC {

    void apply(int program, int location, long x);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM1I64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM1I64NVPROC.class, fi, constants$461.PFNGLPROGRAMUNIFORM1I64NVPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM1I64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, long _x) -> {
            try {
                constants$461.PFNGLPROGRAMUNIFORM1I64NVPROC$MH.invokeExact((Addressable)symbol, _program, _location, _x);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


