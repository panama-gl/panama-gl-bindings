// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISTRANSFORMFEEDBACKPROC {

    byte apply(int id);
    static MemorySegment allocate(PFNGLISTRANSFORMFEEDBACKPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISTRANSFORMFEEDBACKPROC.class, fi, constants$216.PFNGLISTRANSFORMFEEDBACKPROC$FUNC, session);
    }
    static PFNGLISTRANSFORMFEEDBACKPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id) -> {
            try {
                return (byte)constants$216.PFNGLISTRANSFORMFEEDBACKPROC$MH.invokeExact((Addressable)symbol, _id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


