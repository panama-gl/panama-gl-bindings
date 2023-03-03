// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC {

    void apply(int texture, int target, int samples, int internalFormat, int width, int height, byte fixedSampleLocations);
    static MemorySegment allocate(PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC.class, fi, constants$912.PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC$FUNC, session);
    }
    static PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _target, int _samples, int _internalFormat, int _width, int _height, byte _fixedSampleLocations) -> {
            try {
                constants$912.PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC$MH.invokeExact((Addressable)symbol, _texture, _target, _samples, _internalFormat, _width, _height, _fixedSampleLocations);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

