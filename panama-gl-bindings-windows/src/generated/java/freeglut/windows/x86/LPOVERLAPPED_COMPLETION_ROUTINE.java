// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPOVERLAPPED_COMPLETION_ROUTINE {

    void apply(int dwErrorCode, int dwNumberOfBytesTransfered, java.lang.foreign.MemoryAddress lpOverlapped);
    static MemorySegment allocate(LPOVERLAPPED_COMPLETION_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPOVERLAPPED_COMPLETION_ROUTINE.class, fi, constants$130.LPOVERLAPPED_COMPLETION_ROUTINE$FUNC, session);
    }
    static LPOVERLAPPED_COMPLETION_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dwErrorCode, int _dwNumberOfBytesTransfered, java.lang.foreign.MemoryAddress _lpOverlapped) -> {
            try {
                constants$130.LPOVERLAPPED_COMPLETION_ROUTINE$MH.invokeExact((Addressable)symbol, _dwErrorCode, _dwNumberOfBytesTransfered, (java.lang.foreign.Addressable)_lpOverlapped);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


