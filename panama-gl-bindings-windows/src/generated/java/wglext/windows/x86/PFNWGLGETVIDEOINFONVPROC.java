// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLGETVIDEOINFONVPROC {

    int apply(java.lang.foreign.MemoryAddress hpVideoDevice, java.lang.foreign.MemoryAddress pulCounterOutputPbuffer, java.lang.foreign.MemoryAddress pulCounterOutputVideo);
    static MemorySegment allocate(PFNWGLGETVIDEOINFONVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLGETVIDEOINFONVPROC.class, fi, constants$1405.PFNWGLGETVIDEOINFONVPROC$FUNC, session);
    }
    static PFNWGLGETVIDEOINFONVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hpVideoDevice, java.lang.foreign.MemoryAddress _pulCounterOutputPbuffer, java.lang.foreign.MemoryAddress _pulCounterOutputVideo) -> {
            try {
                return (int)constants$1405.PFNWGLGETVIDEOINFONVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hpVideoDevice, (java.lang.foreign.Addressable)_pulCounterOutputPbuffer, (java.lang.foreign.Addressable)_pulCounterOutputVideo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


