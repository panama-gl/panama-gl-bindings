// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLASYNCCOPYIMAGESUBDATANVXPROC {

    int apply(int waitSemaphoreCount, java.lang.foreign.MemoryAddress waitSemaphoreArray, java.lang.foreign.MemoryAddress waitValueArray, int srcGpu, int dstGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth, int signalSemaphoreCount, java.lang.foreign.MemoryAddress signalSemaphoreArray, java.lang.foreign.MemoryAddress signalValueArray);
    static MemorySegment allocate(PFNGLASYNCCOPYIMAGESUBDATANVXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLASYNCCOPYIMAGESUBDATANVXPROC.class, fi, constants$1036.PFNGLASYNCCOPYIMAGESUBDATANVXPROC$FUNC, session);
    }
    static PFNGLASYNCCOPYIMAGESUBDATANVXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _waitSemaphoreCount, java.lang.foreign.MemoryAddress _waitSemaphoreArray, java.lang.foreign.MemoryAddress _waitValueArray, int _srcGpu, int _dstGpuMask, int _srcName, int _srcTarget, int _srcLevel, int _srcX, int _srcY, int _srcZ, int _dstName, int _dstTarget, int _dstLevel, int _dstX, int _dstY, int _dstZ, int _srcWidth, int _srcHeight, int _srcDepth, int _signalSemaphoreCount, java.lang.foreign.MemoryAddress _signalSemaphoreArray, java.lang.foreign.MemoryAddress _signalValueArray) -> {
            try {
                return (int)constants$1036.PFNGLASYNCCOPYIMAGESUBDATANVXPROC$MH.invokeExact((Addressable)symbol, _waitSemaphoreCount, (java.lang.foreign.Addressable)_waitSemaphoreArray, (java.lang.foreign.Addressable)_waitValueArray, _srcGpu, _dstGpuMask, _srcName, _srcTarget, _srcLevel, _srcX, _srcY, _srcZ, _dstName, _dstTarget, _dstLevel, _dstX, _dstY, _dstZ, _srcWidth, _srcHeight, _srcDepth, _signalSemaphoreCount, (java.lang.foreign.Addressable)_signalSemaphoreArray, (java.lang.foreign.Addressable)_signalValueArray);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


