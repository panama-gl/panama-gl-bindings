// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM4UI64NVPROC {

    void apply(int location, long x, long y, long z, long w);
    static MemorySegment allocate(PFNGLUNIFORM4UI64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4UI64NVPROC.class, fi, constants$459.PFNGLUNIFORM4UI64NVPROC$FUNC, session);
    }
    static PFNGLUNIFORM4UI64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, long _x, long _y, long _z, long _w) -> {
            try {
                constants$459.PFNGLUNIFORM4UI64NVPROC$MH.invokeExact((Addressable)symbol, _location, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


