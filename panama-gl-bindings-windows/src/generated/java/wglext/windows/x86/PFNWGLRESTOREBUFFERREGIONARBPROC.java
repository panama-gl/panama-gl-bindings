// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLRESTOREBUFFERREGIONARBPROC {

    int apply(java.lang.foreign.MemoryAddress hRegion, int x, int y, int width, int height, int xSrc, int ySrc);
    static MemorySegment allocate(PFNWGLRESTOREBUFFERREGIONARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLRESTOREBUFFERREGIONARBPROC.class, fi, constants$1369.PFNWGLRESTOREBUFFERREGIONARBPROC$FUNC, session);
    }
    static PFNWGLRESTOREBUFFERREGIONARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hRegion, int _x, int _y, int _width, int _height, int _xSrc, int _ySrc) -> {
            try {
                return (int)constants$1369.PFNWGLRESTOREBUFFERREGIONARBPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hRegion, _x, _y, _width, _height, _xSrc, _ySrc);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

