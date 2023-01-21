// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTUREBUFFEREXTPROC {

    void apply(int texture, int target, int internalformat, int buffer);
    static MemorySegment allocate(PFNGLTEXTUREBUFFEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREBUFFEREXTPROC.class, fi, constants$666.PFNGLTEXTUREBUFFEREXTPROC$FUNC, session);
    }
    static PFNGLTEXTUREBUFFEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _target, int _internalformat, int _buffer) -> {
            try {
                constants$666.PFNGLTEXTUREBUFFEREXTPROC$MH.invokeExact((Addressable)symbol, _texture, _target, _internalformat, _buffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


