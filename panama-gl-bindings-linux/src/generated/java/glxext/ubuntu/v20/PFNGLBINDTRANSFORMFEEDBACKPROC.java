// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDTRANSFORMFEEDBACKPROC {

    void apply(int target, int id);
    static MemorySegment allocate(PFNGLBINDTRANSFORMFEEDBACKPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDTRANSFORMFEEDBACKPROC.class, fi, constants$301.PFNGLBINDTRANSFORMFEEDBACKPROC$FUNC, session);
    }
    static PFNGLBINDTRANSFORMFEEDBACKPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _id) -> {
            try {
                constants$301.PFNGLBINDTRANSFORMFEEDBACKPROC$MH.invokeExact((Addressable)symbol, _target, _id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


