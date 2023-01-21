// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROC {

    void apply(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, java.lang.foreign.MemoryAddress bits);
    static MemorySegment allocate(PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROC.class, fi, constants$652.PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROC$FUNC, session);
    }
    static PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texunit, int _target, int _level, int _xoffset, int _yoffset, int _zoffset, int _width, int _height, int _depth, int _format, int _imageSize, java.lang.foreign.MemoryAddress _bits) -> {
            try {
                constants$652.PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROC$MH.invokeExact((Addressable)symbol, _texunit, _target, _level, _xoffset, _yoffset, _zoffset, _width, _height, _depth, _format, _imageSize, (java.lang.foreign.Addressable)_bits);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


