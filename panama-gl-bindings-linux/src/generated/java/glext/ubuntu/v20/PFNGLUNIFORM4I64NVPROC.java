// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM4I64NVPROC {

    void apply(int location, long x, long y, long z, long w);
    static MemorySegment allocate(PFNGLUNIFORM4I64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4I64NVPROC.class, fi, constants$456.PFNGLUNIFORM4I64NVPROC$FUNC, session);
    }
    static PFNGLUNIFORM4I64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, long _x, long _y, long _z, long _w) -> {
            try {
                constants$456.PFNGLUNIFORM4I64NVPROC$MH.invokeExact((Addressable)symbol, _location, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


