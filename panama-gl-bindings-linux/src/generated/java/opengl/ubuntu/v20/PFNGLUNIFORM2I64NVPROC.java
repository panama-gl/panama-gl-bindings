// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM2I64NVPROC {

    void apply(int location, long x, long y);
    static MemorySegment allocate(PFNGLUNIFORM2I64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2I64NVPROC.class, fi, constants$456.PFNGLUNIFORM2I64NVPROC$FUNC, session);
    }
    static PFNGLUNIFORM2I64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, long _x, long _y) -> {
            try {
                constants$456.PFNGLUNIFORM2I64NVPROC$MH.invokeExact((Addressable)symbol, _location, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


