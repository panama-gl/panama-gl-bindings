// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROC {

    void apply(int semaphore, int handleType, java.lang.foreign.MemoryAddress name);
    static MemorySegment allocate(PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROC.class, fi, constants$748.PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROC$FUNC, session);
    }
    static PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _semaphore, int _handleType, java.lang.foreign.MemoryAddress _name) -> {
            try {
                constants$748.PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROC$MH.invokeExact((Addressable)symbol, _semaphore, _handleType, (java.lang.foreign.Addressable)_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

