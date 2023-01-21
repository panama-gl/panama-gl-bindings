// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBITMAPXOESPROC {

    void apply(int width, int height, int xorig, int yorig, int xmove, int ymove, java.lang.foreign.MemoryAddress bitmap);
    static MemorySegment allocate(PFNGLBITMAPXOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBITMAPXOESPROC.class, fi, constants$511.PFNGLBITMAPXOESPROC$FUNC, session);
    }
    static PFNGLBITMAPXOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _width, int _height, int _xorig, int _yorig, int _xmove, int _ymove, java.lang.foreign.MemoryAddress _bitmap) -> {
            try {
                constants$511.PFNGLBITMAPXOESPROC$MH.invokeExact((Addressable)symbol, _width, _height, _xorig, _yorig, _xmove, _ymove, (java.lang.foreign.Addressable)_bitmap);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


