// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC {

    void apply(int buffer, long offset, long size, java.lang.foreign.MemoryAddress clientBuffer, int flags);
    static MemorySegment allocate(PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC.class, fi, constants$887.PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC$FUNC, session);
    }
    static PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, long _offset, long _size, java.lang.foreign.MemoryAddress _clientBuffer, int _flags) -> {
            try {
                constants$887.PFNGLNAMEDBUFFERSTORAGEEXTERNALEXTPROC$MH.invokeExact((Addressable)symbol, _buffer, _offset, _size, (java.lang.foreign.Addressable)_clientBuffer, _flags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


