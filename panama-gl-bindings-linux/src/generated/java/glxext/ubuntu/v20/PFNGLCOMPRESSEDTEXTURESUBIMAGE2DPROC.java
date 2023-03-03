// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC {

    void apply(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC.class, fi, constants$374.PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC$FUNC, session);
    }
    static PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _level, int _xoffset, int _yoffset, int _width, int _height, int _format, int _imageSize, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$374.PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC$MH.invokeExact((Addressable)symbol, _texture, _level, _xoffset, _yoffset, _width, _height, _format, _imageSize, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

