// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLIMPORTSEMAPHOREFDEXTPROC {

    void apply(int semaphore, int handleType, int fd);
    static MemorySegment allocate(PFNGLIMPORTSEMAPHOREFDEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLIMPORTSEMAPHOREFDEXTPROC.class, fi, constants$947.PFNGLIMPORTSEMAPHOREFDEXTPROC$FUNC, session);
    }
    static PFNGLIMPORTSEMAPHOREFDEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _semaphore, int _handleType, int _fd) -> {
            try {
                constants$947.PFNGLIMPORTSEMAPHOREFDEXTPROC$MH.invokeExact((Addressable)symbol, _semaphore, _handleType, _fd);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


