// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC {

    void apply(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC.class, fi, constants$158.PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC$FUNC, session);
    }
    static PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _xoffset, int _yoffset, int _zoffset, int _width, int _height, int _depth, int _format, int _imageSize, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$158.PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC$MH.invokeExact((Addressable)symbol, _target, _level, _xoffset, _yoffset, _zoffset, _width, _height, _depth, _format, _imageSize, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


