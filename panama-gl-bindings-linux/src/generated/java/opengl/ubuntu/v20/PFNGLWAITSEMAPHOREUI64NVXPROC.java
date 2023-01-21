// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWAITSEMAPHOREUI64NVXPROC {

    void apply(int waitGpu, int fenceObjectCount, java.lang.foreign.MemoryAddress semaphoreArray, java.lang.foreign.MemoryAddress fenceValueArray);
    static MemorySegment allocate(PFNGLWAITSEMAPHOREUI64NVXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWAITSEMAPHOREUI64NVXPROC.class, fi, constants$724.PFNGLWAITSEMAPHOREUI64NVXPROC$FUNC, session);
    }
    static PFNGLWAITSEMAPHOREUI64NVXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _waitGpu, int _fenceObjectCount, java.lang.foreign.MemoryAddress _semaphoreArray, java.lang.foreign.MemoryAddress _fenceValueArray) -> {
            try {
                constants$724.PFNGLWAITSEMAPHOREUI64NVXPROC$MH.invokeExact((Addressable)symbol, _waitGpu, _fenceObjectCount, (java.lang.foreign.Addressable)_semaphoreArray, (java.lang.foreign.Addressable)_fenceValueArray);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


