// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDEBUGMESSAGECALLBACKPROC {

    void apply(java.lang.foreign.MemoryAddress callback, java.lang.foreign.MemoryAddress userParam);
    static MemorySegment allocate(PFNGLDEBUGMESSAGECALLBACKPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDEBUGMESSAGECALLBACKPROC.class, fi, constants$345.PFNGLDEBUGMESSAGECALLBACKPROC$FUNC, session);
    }
    static PFNGLDEBUGMESSAGECALLBACKPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _callback, java.lang.foreign.MemoryAddress _userParam) -> {
            try {
                constants$345.PFNGLDEBUGMESSAGECALLBACKPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_callback, (java.lang.foreign.Addressable)_userParam);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


