// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUPDATEOBJECTBUFFERATIPROC {

    void apply(int buffer, int offset, int size, java.lang.foreign.MemoryAddress pointer, int preserve);
    static MemorySegment allocate(PFNGLUPDATEOBJECTBUFFERATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUPDATEOBJECTBUFFERATIPROC.class, fi, constants$496.PFNGLUPDATEOBJECTBUFFERATIPROC$FUNC, session);
    }
    static PFNGLUPDATEOBJECTBUFFERATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, int _offset, int _size, java.lang.foreign.MemoryAddress _pointer, int _preserve) -> {
            try {
                constants$496.PFNGLUPDATEOBJECTBUFFERATIPROC$MH.invokeExact((Addressable)symbol, _buffer, _offset, _size, (java.lang.foreign.Addressable)_pointer, _preserve);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


