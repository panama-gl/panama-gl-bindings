// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTUREBUFFERPROC {

    void apply(int texture, int internalformat, int buffer);
    static MemorySegment allocate(PFNGLTEXTUREBUFFERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREBUFFERPROC.class, fi, constants$374.PFNGLTEXTUREBUFFERPROC$FUNC, session);
    }
    static PFNGLTEXTUREBUFFERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _internalformat, int _buffer) -> {
            try {
                constants$374.PFNGLTEXTUREBUFFERPROC$MH.invokeExact((Addressable)symbol, _texture, _internalformat, _buffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

