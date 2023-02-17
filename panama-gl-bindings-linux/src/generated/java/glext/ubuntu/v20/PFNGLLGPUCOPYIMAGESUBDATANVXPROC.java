// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLLGPUCOPYIMAGESUBDATANVXPROC {

    void apply(int sourceGpu, int destinationGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srxY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth);
    static MemorySegment allocate(PFNGLLGPUCOPYIMAGESUBDATANVXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLLGPUCOPYIMAGESUBDATANVXPROC.class, fi, constants$1037.PFNGLLGPUCOPYIMAGESUBDATANVXPROC$FUNC, session);
    }
    static PFNGLLGPUCOPYIMAGESUBDATANVXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _sourceGpu, int _destinationGpuMask, int _srcName, int _srcTarget, int _srcLevel, int _srcX, int _srxY, int _srcZ, int _dstName, int _dstTarget, int _dstLevel, int _dstX, int _dstY, int _dstZ, int _width, int _height, int _depth) -> {
            try {
                constants$1038.PFNGLLGPUCOPYIMAGESUBDATANVXPROC$MH.invokeExact((Addressable)symbol, _sourceGpu, _destinationGpuMask, _srcName, _srcTarget, _srcLevel, _srcX, _srxY, _srcZ, _dstName, _dstTarget, _dstLevel, _dstX, _dstY, _dstZ, _width, _height, _depth);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


