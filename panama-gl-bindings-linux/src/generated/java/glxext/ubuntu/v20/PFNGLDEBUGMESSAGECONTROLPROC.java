// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDEBUGMESSAGECONTROLPROC {

    void apply(int source, int type, int severity, int count, java.lang.foreign.MemoryAddress ids, byte enabled);
    static MemorySegment allocate(PFNGLDEBUGMESSAGECONTROLPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDEBUGMESSAGECONTROLPROC.class, fi, constants$349.PFNGLDEBUGMESSAGECONTROLPROC$FUNC, session);
    }
    static PFNGLDEBUGMESSAGECONTROLPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _source, int _type, int _severity, int _count, java.lang.foreign.MemoryAddress _ids, byte _enabled) -> {
            try {
                constants$349.PFNGLDEBUGMESSAGECONTROLPROC$MH.invokeExact((Addressable)symbol, _source, _type, _severity, _count, (java.lang.foreign.Addressable)_ids, _enabled);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


