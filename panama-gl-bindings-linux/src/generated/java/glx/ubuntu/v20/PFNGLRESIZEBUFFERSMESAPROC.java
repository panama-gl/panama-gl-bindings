// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLRESIZEBUFFERSMESAPROC {

    void apply();
    static MemorySegment allocate(PFNGLRESIZEBUFFERSMESAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLRESIZEBUFFERSMESAPROC.class, fi, constants$797.PFNGLRESIZEBUFFERSMESAPROC$FUNC, session);
    }
    static PFNGLRESIZEBUFFERSMESAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$797.PFNGLRESIZEBUFFERSMESAPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


