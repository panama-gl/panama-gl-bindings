// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBL1UI64NVPROC {

    void apply(int index, long x);
    static MemorySegment allocate(PFNGLVERTEXATTRIBL1UI64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL1UI64NVPROC.class, fi, constants$1215.PFNGLVERTEXATTRIBL1UI64NVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBL1UI64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, long _x) -> {
            try {
                constants$1215.PFNGLVERTEXATTRIBL1UI64NVPROC$MH.invokeExact((Addressable)symbol, _index, _x);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


