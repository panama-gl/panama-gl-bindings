// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCLEARTEXSUBIMAGEPROC {

    void apply(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLCLEARTEXSUBIMAGEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCLEARTEXSUBIMAGEPROC.class, fi, constants$353.PFNGLCLEARTEXSUBIMAGEPROC$FUNC, session);
    }
    static PFNGLCLEARTEXSUBIMAGEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _level, int _xoffset, int _yoffset, int _zoffset, int _width, int _height, int _depth, int _format, int _type, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$353.PFNGLCLEARTEXSUBIMAGEPROC$MH.invokeExact((Addressable)symbol, _texture, _level, _xoffset, _yoffset, _zoffset, _width, _height, _depth, _format, _type, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


