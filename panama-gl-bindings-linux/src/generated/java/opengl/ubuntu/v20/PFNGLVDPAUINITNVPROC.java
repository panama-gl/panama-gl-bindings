// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVDPAUINITNVPROC {

    void apply(java.lang.foreign.MemoryAddress vdpDevice, java.lang.foreign.MemoryAddress getProcAddress);
    static MemorySegment allocate(PFNGLVDPAUINITNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUINITNVPROC.class, fi, constants$835.PFNGLVDPAUINITNVPROC$FUNC, session);
    }
    static PFNGLVDPAUINITNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _vdpDevice, java.lang.foreign.MemoryAddress _getProcAddress) -> {
            try {
                constants$835.PFNGLVDPAUINITNVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_vdpDevice, (java.lang.foreign.Addressable)_getProcAddress);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


