// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBL3UI64NVPROC {

    void apply(int index, long x, long y, long z);
    static MemorySegment allocate(PFNGLVERTEXATTRIBL3UI64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL3UI64NVPROC.class, fi, constants$1215.PFNGLVERTEXATTRIBL3UI64NVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBL3UI64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, long _x, long _y, long _z) -> {
            try {
                constants$1215.PFNGLVERTEXATTRIBL3UI64NVPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


