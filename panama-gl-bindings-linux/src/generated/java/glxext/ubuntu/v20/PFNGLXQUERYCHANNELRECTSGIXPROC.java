// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXQUERYCHANNELRECTSGIXPROC {

    int apply(java.lang.foreign.MemoryAddress display, int screen, int channel, java.lang.foreign.MemoryAddress dx, java.lang.foreign.MemoryAddress dy, java.lang.foreign.MemoryAddress dw, java.lang.foreign.MemoryAddress dh);
    static MemorySegment allocate(PFNGLXQUERYCHANNELRECTSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYCHANNELRECTSGIXPROC.class, fi, constants$1056.PFNGLXQUERYCHANNELRECTSGIXPROC$FUNC, session);
    }
    static PFNGLXQUERYCHANNELRECTSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _display, int _screen, int _channel, java.lang.foreign.MemoryAddress _dx, java.lang.foreign.MemoryAddress _dy, java.lang.foreign.MemoryAddress _dw, java.lang.foreign.MemoryAddress _dh) -> {
            try {
                return (int)constants$1056.PFNGLXQUERYCHANNELRECTSGIXPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_display, _screen, _channel, (java.lang.foreign.Addressable)_dx, (java.lang.foreign.Addressable)_dy, (java.lang.foreign.Addressable)_dw, (java.lang.foreign.Addressable)_dh);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


