// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYIMAGESUBDATANVPROC {

    void apply(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth);
    static MemorySegment allocate(PFNGLCOPYIMAGESUBDATANVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYIMAGESUBDATANVPROC.class, fi, constants$824.PFNGLCOPYIMAGESUBDATANVPROC$FUNC, session);
    }
    static PFNGLCOPYIMAGESUBDATANVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _srcName, int _srcTarget, int _srcLevel, int _srcX, int _srcY, int _srcZ, int _dstName, int _dstTarget, int _dstLevel, int _dstX, int _dstY, int _dstZ, int _width, int _height, int _depth) -> {
            try {
                constants$824.PFNGLCOPYIMAGESUBDATANVPROC$MH.invokeExact((Addressable)symbol, _srcName, _srcTarget, _srcLevel, _srcX, _srcY, _srcZ, _dstName, _dstTarget, _dstLevel, _dstX, _dstY, _dstZ, _width, _height, _depth);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


