// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBL2UI64NVPROC {

    void apply(int index, long x, long y);
    static MemorySegment allocate(PFNGLVERTEXATTRIBL2UI64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL2UI64NVPROC.class, fi, constants$927.PFNGLVERTEXATTRIBL2UI64NVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBL2UI64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, long _x, long _y) -> {
            try {
                constants$927.PFNGLVERTEXATTRIBL2UI64NVPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


