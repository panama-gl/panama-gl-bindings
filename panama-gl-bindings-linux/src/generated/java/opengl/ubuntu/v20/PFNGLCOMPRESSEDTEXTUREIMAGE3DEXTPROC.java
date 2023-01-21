// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROC {

    void apply(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, java.lang.foreign.MemoryAddress bits);
    static MemorySegment allocate(PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROC.class, fi, constants$564.PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROC$FUNC, session);
    }
    static PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _target, int _level, int _internalformat, int _width, int _height, int _depth, int _border, int _imageSize, java.lang.foreign.MemoryAddress _bits) -> {
            try {
                constants$564.PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROC$MH.invokeExact((Addressable)symbol, _texture, _target, _level, _internalformat, _width, _height, _depth, _border, _imageSize, (java.lang.foreign.Addressable)_bits);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


