// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLLGPUNAMEDBUFFERSUBDATANVXPROC {

    void apply(int gpuMask, int buffer, long offset, long size, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLLGPUNAMEDBUFFERSUBDATANVXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLLGPUNAMEDBUFFERSUBDATANVXPROC.class, fi, constants$722.PFNGLLGPUNAMEDBUFFERSUBDATANVXPROC$FUNC, session);
    }
    static PFNGLLGPUNAMEDBUFFERSUBDATANVXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _gpuMask, int _buffer, long _offset, long _size, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$722.PFNGLLGPUNAMEDBUFFERSUBDATANVXPROC$MH.invokeExact((Addressable)symbol, _gpuMask, _buffer, _offset, _size, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


