// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDEBUGMESSAGEINSERTAMDPROC {

    void apply(int category, int severity, int id, int length, java.lang.foreign.MemoryAddress buf);
    static MemorySegment allocate(PFNGLDEBUGMESSAGEINSERTAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDEBUGMESSAGEINSERTAMDPROC.class, fi, constants$536.PFNGLDEBUGMESSAGEINSERTAMDPROC$FUNC, session);
    }
    static PFNGLDEBUGMESSAGEINSERTAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _category, int _severity, int _id, int _length, java.lang.foreign.MemoryAddress _buf) -> {
            try {
                constants$536.PFNGLDEBUGMESSAGEINSERTAMDPROC$MH.invokeExact((Addressable)symbol, _category, _severity, _id, _length, (java.lang.foreign.Addressable)_buf);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

