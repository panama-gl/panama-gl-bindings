// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDISPATCHCOMPUTEINDIRECTPROC {

    void apply(long indirect);
    static MemorySegment allocate(PFNGLDISPATCHCOMPUTEINDIRECTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDISPATCHCOMPUTEINDIRECTPROC.class, fi, constants$339.PFNGLDISPATCHCOMPUTEINDIRECTPROC$FUNC, session);
    }
    static PFNGLDISPATCHCOMPUTEINDIRECTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _indirect) -> {
            try {
                constants$339.PFNGLDISPATCHCOMPUTEINDIRECTPROC$MH.invokeExact((Addressable)symbol, _indirect);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


