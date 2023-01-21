// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC {

    void apply(int texture, int target, int level, int internalformat, int width, int border, int imageSize, java.lang.foreign.MemoryAddress bits);
    static MemorySegment allocate(PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC.class, fi, constants$650.PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC$FUNC, session);
    }
    static PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _target, int _level, int _internalformat, int _width, int _border, int _imageSize, java.lang.foreign.MemoryAddress _bits) -> {
            try {
                constants$650.PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC$MH.invokeExact((Addressable)symbol, _texture, _target, _level, _internalformat, _width, _border, _imageSize, (java.lang.foreign.Addressable)_bits);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

