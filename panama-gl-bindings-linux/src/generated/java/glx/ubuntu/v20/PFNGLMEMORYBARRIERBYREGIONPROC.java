// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMEMORYBARRIERBYREGIONPROC {

    void apply(int barriers);
    static MemorySegment allocate(PFNGLMEMORYBARRIERBYREGIONPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMEMORYBARRIERBYREGIONPROC.class, fi, constants$388.PFNGLMEMORYBARRIERBYREGIONPROC$FUNC, session);
    }
    static PFNGLMEMORYBARRIERBYREGIONPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _barriers) -> {
            try {
                constants$388.PFNGLMEMORYBARRIERBYREGIONPROC$MH.invokeExact((Addressable)symbol, _barriers);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


