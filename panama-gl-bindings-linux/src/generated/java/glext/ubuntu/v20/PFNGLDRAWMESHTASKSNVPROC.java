// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWMESHTASKSNVPROC {

    void apply(int first, int count);
    static MemorySegment allocate(PFNGLDRAWMESHTASKSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWMESHTASKSNVPROC.class, fi, constants$1125.PFNGLDRAWMESHTASKSNVPROC$FUNC, session);
    }
    static PFNGLDRAWMESHTASKSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _first, int _count) -> {
            try {
                constants$1126.PFNGLDRAWMESHTASKSNVPROC$MH.invokeExact((Addressable)symbol, _first, _count);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


