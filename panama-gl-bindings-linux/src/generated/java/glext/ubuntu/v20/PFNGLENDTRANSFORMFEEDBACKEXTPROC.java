// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLENDTRANSFORMFEEDBACKEXTPROC {

    void apply();
    static MemorySegment allocate(PFNGLENDTRANSFORMFEEDBACKEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLENDTRANSFORMFEEDBACKEXTPROC.class, fi, constants$963.PFNGLENDTRANSFORMFEEDBACKEXTPROC$FUNC, session);
    }
    static PFNGLENDTRANSFORMFEEDBACKEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$964.PFNGLENDTRANSFORMFEEDBACKEXTPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

