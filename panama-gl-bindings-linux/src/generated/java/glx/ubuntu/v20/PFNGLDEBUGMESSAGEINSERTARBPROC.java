// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDEBUGMESSAGEINSERTARBPROC {

    void apply(int source, int type, int id, int severity, int length, java.lang.foreign.MemoryAddress buf);
    static MemorySegment allocate(PFNGLDEBUGMESSAGEINSERTARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDEBUGMESSAGEINSERTARBPROC.class, fi, constants$405.PFNGLDEBUGMESSAGEINSERTARBPROC$FUNC, session);
    }
    static PFNGLDEBUGMESSAGEINSERTARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _source, int _type, int _id, int _severity, int _length, java.lang.foreign.MemoryAddress _buf) -> {
            try {
                constants$405.PFNGLDEBUGMESSAGEINSERTARBPROC$MH.invokeExact((Addressable)symbol, _source, _type, _id, _severity, _length, (java.lang.foreign.Addressable)_buf);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

