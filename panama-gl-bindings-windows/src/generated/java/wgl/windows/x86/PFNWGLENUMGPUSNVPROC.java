// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLENUMGPUSNVPROC {

    int apply(int iGpuIndex, java.lang.foreign.MemoryAddress phGpu);
    static MemorySegment allocate(PFNWGLENUMGPUSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLENUMGPUSNVPROC.class, fi, constants$1405.PFNWGLENUMGPUSNVPROC$FUNC, session);
    }
    static PFNWGLENUMGPUSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _iGpuIndex, java.lang.foreign.MemoryAddress _phGpu) -> {
            try {
                return (int)constants$1405.PFNWGLENUMGPUSNVPROC$MH.invokeExact((Addressable)symbol, _iGpuIndex, (java.lang.foreign.Addressable)_phGpu);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

