// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC {

    void apply(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC.class, fi, constants$158.PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC$FUNC, session);
    }
    static PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _xoffset, int _yoffset, int _width, int _height, int _format, int _imageSize, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$158.PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC$MH.invokeExact((Addressable)symbol, _target, _level, _xoffset, _yoffset, _width, _height, _format, _imageSize, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


