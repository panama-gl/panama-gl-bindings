// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLREALIZELAYERPALETTEPROC {

    int apply(java.lang.foreign.MemoryAddress hdc, int iLayerPlane, int bRealize);
    static MemorySegment allocate(PFNWGLREALIZELAYERPALETTEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLREALIZELAYERPALETTEPROC.class, fi, constants$1373.PFNWGLREALIZELAYERPALETTEPROC$FUNC, session);
    }
    static PFNWGLREALIZELAYERPALETTEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hdc, int _iLayerPlane, int _bRealize) -> {
            try {
                return (int)constants$1373.PFNWGLREALIZELAYERPALETTEPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hdc, _iLayerPlane, _bRealize);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

