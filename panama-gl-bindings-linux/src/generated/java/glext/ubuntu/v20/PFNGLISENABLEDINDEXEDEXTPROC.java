// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISENABLEDINDEXEDEXTPROC {

    byte apply(int target, int index);
    static MemorySegment allocate(PFNGLISENABLEDINDEXEDEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISENABLEDINDEXEDEXTPROC.class, fi, constants$784.PFNGLISENABLEDINDEXEDEXTPROC$FUNC, session);
    }
    static PFNGLISENABLEDINDEXEDEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index) -> {
            try {
                return (byte)constants$784.PFNGLISENABLEDINDEXEDEXTPROC$MH.invokeExact((Addressable)symbol, _target, _index);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


