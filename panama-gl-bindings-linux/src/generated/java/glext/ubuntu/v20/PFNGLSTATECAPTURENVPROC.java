// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSTATECAPTURENVPROC {

    void apply(int state, int mode);
    static MemorySegment allocate(PFNGLSTATECAPTURENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSTATECAPTURENVPROC.class, fi, constants$1052.PFNGLSTATECAPTURENVPROC$FUNC, session);
    }
    static PFNGLSTATECAPTURENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _state, int _mode) -> {
            try {
                constants$1052.PFNGLSTATECAPTURENVPROC$MH.invokeExact((Addressable)symbol, _state, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


