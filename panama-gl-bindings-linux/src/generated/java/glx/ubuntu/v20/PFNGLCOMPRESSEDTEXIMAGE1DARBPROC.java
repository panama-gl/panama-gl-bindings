// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMPRESSEDTEXIMAGE1DARBPROC {

    void apply(int target, int level, int internalformat, int width, int border, int imageSize, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLCOMPRESSEDTEXIMAGE1DARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXIMAGE1DARBPROC.class, fi, constants$460.PFNGLCOMPRESSEDTEXIMAGE1DARBPROC$FUNC, session);
    }
    static PFNGLCOMPRESSEDTEXIMAGE1DARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _internalformat, int _width, int _border, int _imageSize, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$460.PFNGLCOMPRESSEDTEXIMAGE1DARBPROC$MH.invokeExact((Addressable)symbol, _target, _level, _internalformat, _width, _border, _imageSize, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


