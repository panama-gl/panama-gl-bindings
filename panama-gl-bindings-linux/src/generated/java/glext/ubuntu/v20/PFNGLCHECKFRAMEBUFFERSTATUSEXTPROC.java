// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC {

    int apply(int target);
    static MemorySegment allocate(PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC.class, fi, constants$894.PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC$FUNC, session);
    }
    static PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target) -> {
            try {
                return (int)constants$895.PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC$MH.invokeExact((Addressable)symbol, _target);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


