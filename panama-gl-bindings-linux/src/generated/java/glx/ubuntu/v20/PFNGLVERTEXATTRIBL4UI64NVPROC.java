// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBL4UI64NVPROC {

    void apply(int index, long x, long y, long z, long w);
    static MemorySegment allocate(PFNGLVERTEXATTRIBL4UI64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL4UI64NVPROC.class, fi, constants$928.PFNGLVERTEXATTRIBL4UI64NVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBL4UI64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, long _x, long _y, long _z, long _w) -> {
            try {
                constants$928.PFNGLVERTEXATTRIBL4UI64NVPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

