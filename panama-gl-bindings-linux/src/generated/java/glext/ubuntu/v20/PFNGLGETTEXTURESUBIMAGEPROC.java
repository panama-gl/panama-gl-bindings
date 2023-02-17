// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTEXTURESUBIMAGEPROC {

    void apply(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, java.lang.foreign.MemoryAddress pixels);
    static MemorySegment allocate(PFNGLGETTEXTURESUBIMAGEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURESUBIMAGEPROC.class, fi, constants$392.PFNGLGETTEXTURESUBIMAGEPROC$FUNC, session);
    }
    static PFNGLGETTEXTURESUBIMAGEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _level, int _xoffset, int _yoffset, int _zoffset, int _width, int _height, int _depth, int _format, int _type, int _bufSize, java.lang.foreign.MemoryAddress _pixels) -> {
            try {
                constants$392.PFNGLGETTEXTURESUBIMAGEPROC$MH.invokeExact((Addressable)symbol, _texture, _level, _xoffset, _yoffset, _zoffset, _width, _height, _depth, _format, _type, _bufSize, (java.lang.foreign.Addressable)_pixels);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


