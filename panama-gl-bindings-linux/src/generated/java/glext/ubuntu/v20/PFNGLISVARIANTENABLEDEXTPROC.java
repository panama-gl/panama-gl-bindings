// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISVARIANTENABLEDEXTPROC {

    byte apply(int id, int cap);
    static MemorySegment allocate(PFNGLISVARIANTENABLEDEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISVARIANTENABLEDEXTPROC.class, fi, constants$986.PFNGLISVARIANTENABLEDEXTPROC$FUNC, session);
    }
    static PFNGLISVARIANTENABLEDEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, int _cap) -> {
            try {
                return (byte)constants$987.PFNGLISVARIANTENABLEDEXTPROC$MH.invokeExact((Addressable)symbol, _id, _cap);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


