// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBEGINTRANSFORMFEEDBACKPROC {

    void apply(int primitiveMode);
    static MemorySegment allocate(PFNGLBEGINTRANSFORMFEEDBACKPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBEGINTRANSFORMFEEDBACKPROC.class, fi, constants$233.PFNGLBEGINTRANSFORMFEEDBACKPROC$FUNC, session);
    }
    static PFNGLBEGINTRANSFORMFEEDBACKPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _primitiveMode) -> {
            try {
                constants$233.PFNGLBEGINTRANSFORMFEEDBACKPROC$MH.invokeExact((Addressable)symbol, _primitiveMode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

