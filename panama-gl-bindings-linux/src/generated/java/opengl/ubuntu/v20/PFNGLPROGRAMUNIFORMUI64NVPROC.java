// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORMUI64NVPROC {

    void apply(int program, int location, long value);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORMUI64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMUI64NVPROC.class, fi, constants$823.PFNGLPROGRAMUNIFORMUI64NVPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORMUI64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, long _value) -> {
            try {
                constants$823.PFNGLPROGRAMUNIFORMUI64NVPROC$MH.invokeExact((Addressable)symbol, _program, _location, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


