// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPAUSETRANSFORMFEEDBACKNVPROC {

    void apply();
    static MemorySegment allocate(PFNGLPAUSETRANSFORMFEEDBACKNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPAUSETRANSFORMFEEDBACKNVPROC.class, fi, constants$834.PFNGLPAUSETRANSFORMFEEDBACKNVPROC$FUNC, session);
    }
    static PFNGLPAUSETRANSFORMFEEDBACKNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$834.PFNGLPAUSETRANSFORMFEEDBACKNVPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


