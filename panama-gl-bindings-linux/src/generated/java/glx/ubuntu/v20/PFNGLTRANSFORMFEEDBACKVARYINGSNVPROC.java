// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC {

    void apply(int program, int count, java.lang.foreign.MemoryAddress locations, int bufferMode);
    static MemorySegment allocate(PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC.class, fi, constants$916.PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC$FUNC, session);
    }
    static PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _count, java.lang.foreign.MemoryAddress _locations, int _bufferMode) -> {
            try {
                constants$916.PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC$MH.invokeExact((Addressable)symbol, _program, _count, (java.lang.foreign.Addressable)_locations, _bufferMode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

