// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXBUFFERRANGEPROC {

    void apply(int target, int internalformat, int buffer, long offset, long size);
    static MemorySegment allocate(PFNGLTEXBUFFERRANGEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXBUFFERRANGEPROC.class, fi, constants$346.PFNGLTEXBUFFERRANGEPROC$FUNC, session);
    }
    static PFNGLTEXBUFFERRANGEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _internalformat, int _buffer, long _offset, long _size) -> {
            try {
                constants$346.PFNGLTEXBUFFERRANGEPROC$MH.invokeExact((Addressable)symbol, _target, _internalformat, _buffer, _offset, _size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

