// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWTRANSFORMFEEDBACKPROC {

    void apply(int mode, int id);
    static MemorySegment allocate(PFNGLDRAWTRANSFORMFEEDBACKPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWTRANSFORMFEEDBACKPROC.class, fi, constants$217.PFNGLDRAWTRANSFORMFEEDBACKPROC$FUNC, session);
    }
    static PFNGLDRAWTRANSFORMFEEDBACKPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _id) -> {
            try {
                constants$217.PFNGLDRAWTRANSFORMFEEDBACKPROC$MH.invokeExact((Addressable)symbol, _mode, _id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


