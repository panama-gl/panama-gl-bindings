// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWTRANSFORMFEEDBACKNVPROC {

    void apply(int mode, int id);
    static MemorySegment allocate(PFNGLDRAWTRANSFORMFEEDBACKNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWTRANSFORMFEEDBACKNVPROC.class, fi, constants$834.PFNGLDRAWTRANSFORMFEEDBACKNVPROC$FUNC, session);
    }
    static PFNGLDRAWTRANSFORMFEEDBACKNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _id) -> {
            try {
                constants$834.PFNGLDRAWTRANSFORMFEEDBACKNVPROC$MH.invokeExact((Addressable)symbol, _mode, _id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


