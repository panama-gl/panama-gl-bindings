// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFEEDBACKBUFFERXOESPROC {

    void apply(int n, int type, java.lang.foreign.MemoryAddress buffer);
    static MemorySegment allocate(PFNGLFEEDBACKBUFFERXOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFEEDBACKBUFFERXOESPROC.class, fi, constants$590.PFNGLFEEDBACKBUFFERXOESPROC$FUNC, session);
    }
    static PFNGLFEEDBACKBUFFERXOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, int _type, java.lang.foreign.MemoryAddress _buffer) -> {
            try {
                constants$590.PFNGLFEEDBACKBUFFERXOESPROC$MH.invokeExact((Addressable)symbol, _n, _type, (java.lang.foreign.Addressable)_buffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


