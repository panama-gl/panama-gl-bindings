// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCLIENTWAITSEMAPHOREUI64NVXPROC {

    void apply(int fenceObjectCount, java.lang.foreign.MemoryAddress semaphoreArray, java.lang.foreign.MemoryAddress fenceValueArray);
    static MemorySegment allocate(PFNGLCLIENTWAITSEMAPHOREUI64NVXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCLIENTWAITSEMAPHOREUI64NVXPROC.class, fi, constants$1040.PFNGLCLIENTWAITSEMAPHOREUI64NVXPROC$FUNC, session);
    }
    static PFNGLCLIENTWAITSEMAPHOREUI64NVXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _fenceObjectCount, java.lang.foreign.MemoryAddress _semaphoreArray, java.lang.foreign.MemoryAddress _fenceValueArray) -> {
            try {
                constants$1040.PFNGLCLIENTWAITSEMAPHOREUI64NVXPROC$MH.invokeExact((Addressable)symbol, _fenceObjectCount, (java.lang.foreign.Addressable)_semaphoreArray, (java.lang.foreign.Addressable)_fenceValueArray);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

