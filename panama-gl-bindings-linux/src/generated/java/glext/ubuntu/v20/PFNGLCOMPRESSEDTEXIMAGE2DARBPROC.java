// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMPRESSEDTEXIMAGE2DARBPROC {

    void apply(int target, int level, int internalformat, int width, int height, int border, int imageSize, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLCOMPRESSEDTEXIMAGE2DARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXIMAGE2DARBPROC.class, fi, constants$374.PFNGLCOMPRESSEDTEXIMAGE2DARBPROC$FUNC, session);
    }
    static PFNGLCOMPRESSEDTEXIMAGE2DARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _internalformat, int _width, int _height, int _border, int _imageSize, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$374.PFNGLCOMPRESSEDTEXIMAGE2DARBPROC$MH.invokeExact((Addressable)symbol, _target, _level, _internalformat, _width, _height, _border, _imageSize, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


