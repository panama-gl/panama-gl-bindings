// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC {

    void apply(int xfb, int index, int buffer);
    static MemorySegment allocate(PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC.class, fi, constants$360.PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC$FUNC, session);
    }
    static PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _xfb, int _index, int _buffer) -> {
            try {
                constants$360.PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC$MH.invokeExact((Addressable)symbol, _xfb, _index, _buffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


