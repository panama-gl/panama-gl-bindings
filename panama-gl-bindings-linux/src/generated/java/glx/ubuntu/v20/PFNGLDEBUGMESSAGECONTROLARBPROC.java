// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDEBUGMESSAGECONTROLARBPROC {

    void apply(int source, int type, int severity, int count, java.lang.foreign.MemoryAddress ids, byte enabled);
    static MemorySegment allocate(PFNGLDEBUGMESSAGECONTROLARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDEBUGMESSAGECONTROLARBPROC.class, fi, constants$404.PFNGLDEBUGMESSAGECONTROLARBPROC$FUNC, session);
    }
    static PFNGLDEBUGMESSAGECONTROLARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _source, int _type, int _severity, int _count, java.lang.foreign.MemoryAddress _ids, byte _enabled) -> {
            try {
                constants$404.PFNGLDEBUGMESSAGECONTROLARBPROC$MH.invokeExact((Addressable)symbol, _source, _type, _severity, _count, (java.lang.foreign.Addressable)_ids, _enabled);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


