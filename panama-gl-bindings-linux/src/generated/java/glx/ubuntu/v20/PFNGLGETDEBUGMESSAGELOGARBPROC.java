// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETDEBUGMESSAGELOGARBPROC {

    int apply(int count, int bufSize, java.lang.foreign.MemoryAddress sources, java.lang.foreign.MemoryAddress types, java.lang.foreign.MemoryAddress ids, java.lang.foreign.MemoryAddress severities, java.lang.foreign.MemoryAddress lengths, java.lang.foreign.MemoryAddress messageLog);
    static MemorySegment allocate(PFNGLGETDEBUGMESSAGELOGARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETDEBUGMESSAGELOGARBPROC.class, fi, constants$405.PFNGLGETDEBUGMESSAGELOGARBPROC$FUNC, session);
    }
    static PFNGLGETDEBUGMESSAGELOGARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _count, int _bufSize, java.lang.foreign.MemoryAddress _sources, java.lang.foreign.MemoryAddress _types, java.lang.foreign.MemoryAddress _ids, java.lang.foreign.MemoryAddress _severities, java.lang.foreign.MemoryAddress _lengths, java.lang.foreign.MemoryAddress _messageLog) -> {
            try {
                return (int)constants$405.PFNGLGETDEBUGMESSAGELOGARBPROC$MH.invokeExact((Addressable)symbol, _count, _bufSize, (java.lang.foreign.Addressable)_sources, (java.lang.foreign.Addressable)_types, (java.lang.foreign.Addressable)_ids, (java.lang.foreign.Addressable)_severities, (java.lang.foreign.Addressable)_lengths, (java.lang.foreign.Addressable)_messageLog);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

