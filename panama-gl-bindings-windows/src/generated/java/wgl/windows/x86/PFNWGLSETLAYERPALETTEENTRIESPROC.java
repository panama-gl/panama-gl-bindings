// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLSETLAYERPALETTEENTRIESPROC {

    int apply(java.lang.foreign.MemoryAddress hdc, int iLayerPlane, int iStart, int cEntries, java.lang.foreign.MemoryAddress pcr);
    static MemorySegment allocate(PFNWGLSETLAYERPALETTEENTRIESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLSETLAYERPALETTEENTRIESPROC.class, fi, constants$1374.PFNWGLSETLAYERPALETTEENTRIESPROC$FUNC, session);
    }
    static PFNWGLSETLAYERPALETTEENTRIESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hdc, int _iLayerPlane, int _iStart, int _cEntries, java.lang.foreign.MemoryAddress _pcr) -> {
            try {
                return (int)constants$1374.PFNWGLSETLAYERPALETTEENTRIESPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hdc, _iLayerPlane, _iStart, _cEntries, (java.lang.foreign.Addressable)_pcr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

