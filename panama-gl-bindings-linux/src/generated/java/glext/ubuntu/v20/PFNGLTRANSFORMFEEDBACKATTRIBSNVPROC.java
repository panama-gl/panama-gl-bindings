// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC {

    void apply(int count, java.lang.foreign.MemoryAddress attribs, int bufferMode);
    static MemorySegment allocate(PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC.class, fi, constants$829.PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC$FUNC, session);
    }
    static PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _count, java.lang.foreign.MemoryAddress _attribs, int _bufferMode) -> {
            try {
                constants$829.PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC$MH.invokeExact((Addressable)symbol, _count, (java.lang.foreign.Addressable)_attribs, _bufferMode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


