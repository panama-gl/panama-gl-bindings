// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBL1I64NVPROC {

    void apply(int index, long x);
    static MemorySegment allocate(PFNGLVERTEXATTRIBL1I64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL1I64NVPROC.class, fi, constants$924.PFNGLVERTEXATTRIBL1I64NVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBL1I64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, long _x) -> {
            try {
                constants$924.PFNGLVERTEXATTRIBL1I64NVPROC$MH.invokeExact((Addressable)symbol, _index, _x);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

