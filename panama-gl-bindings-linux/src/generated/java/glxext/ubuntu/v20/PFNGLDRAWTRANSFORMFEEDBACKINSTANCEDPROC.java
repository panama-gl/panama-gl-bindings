// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC {

    void apply(int mode, int id, int instancecount);
    static MemorySegment allocate(PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC.class, fi, constants$337.PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC$FUNC, session);
    }
    static PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _id, int _instancecount) -> {
            try {
                constants$337.PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC$MH.invokeExact((Addressable)symbol, _mode, _id, _instancecount);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


