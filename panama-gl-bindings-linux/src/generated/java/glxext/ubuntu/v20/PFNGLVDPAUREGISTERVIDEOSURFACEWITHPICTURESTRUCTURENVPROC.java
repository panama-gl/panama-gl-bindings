// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC {

    long apply(java.lang.foreign.MemoryAddress vdpSurface, int target, int numTextureNames, java.lang.foreign.MemoryAddress textureNames, byte isFrameStructure);
    static MemorySegment allocate(PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC.class, fi, constants$923.PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC$FUNC, session);
    }
    static PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _vdpSurface, int _target, int _numTextureNames, java.lang.foreign.MemoryAddress _textureNames, byte _isFrameStructure) -> {
            try {
                return (long)constants$923.PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_vdpSurface, _target, _numTextureNames, (java.lang.foreign.Addressable)_textureNames, _isFrameStructure);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


