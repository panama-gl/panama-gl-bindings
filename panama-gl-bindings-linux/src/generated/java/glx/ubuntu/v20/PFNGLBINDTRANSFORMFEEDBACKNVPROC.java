// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDTRANSFORMFEEDBACKNVPROC {

    void apply(int target, int id);
    static MemorySegment allocate(PFNGLBINDTRANSFORMFEEDBACKNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDTRANSFORMFEEDBACKNVPROC.class, fi, constants$918.PFNGLBINDTRANSFORMFEEDBACKNVPROC$FUNC, session);
    }
    static PFNGLBINDTRANSFORMFEEDBACKNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _id) -> {
            try {
                constants$918.PFNGLBINDTRANSFORMFEEDBACKNVPROC$MH.invokeExact((Addressable)symbol, _target, _id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


