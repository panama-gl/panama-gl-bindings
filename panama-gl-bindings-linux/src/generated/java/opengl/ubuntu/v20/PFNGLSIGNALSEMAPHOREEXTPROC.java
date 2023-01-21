// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSIGNALSEMAPHOREEXTPROC {

    void apply(int semaphore, int numBufferBarriers, java.lang.foreign.MemoryAddress buffers, int numTextureBarriers, java.lang.foreign.MemoryAddress textures, java.lang.foreign.MemoryAddress dstLayouts);
    static MemorySegment allocate(PFNGLSIGNALSEMAPHOREEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSIGNALSEMAPHOREEXTPROC.class, fi, constants$662.PFNGLSIGNALSEMAPHOREEXTPROC$FUNC, session);
    }
    static PFNGLSIGNALSEMAPHOREEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _semaphore, int _numBufferBarriers, java.lang.foreign.MemoryAddress _buffers, int _numTextureBarriers, java.lang.foreign.MemoryAddress _textures, java.lang.foreign.MemoryAddress _dstLayouts) -> {
            try {
                constants$662.PFNGLSIGNALSEMAPHOREEXTPROC$MH.invokeExact((Addressable)symbol, _semaphore, _numBufferBarriers, (java.lang.foreign.Addressable)_buffers, _numTextureBarriers, (java.lang.foreign.Addressable)_textures, (java.lang.foreign.Addressable)_dstLayouts);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


