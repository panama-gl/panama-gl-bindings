// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC {

    void apply(int target, int level, int xoffset, int width, int format, int imageSize, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC.class, fi, constants$461.PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC$FUNC, session);
    }
    static PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _xoffset, int _width, int _format, int _imageSize, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$461.PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC$MH.invokeExact((Addressable)symbol, _target, _level, _xoffset, _width, _format, _imageSize, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


