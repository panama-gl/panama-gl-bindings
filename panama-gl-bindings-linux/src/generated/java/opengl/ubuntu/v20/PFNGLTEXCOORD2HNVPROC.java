// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD2HNVPROC {

    void apply(short s, short t);
    static MemorySegment allocate(PFNGLTEXCOORD2HNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2HNVPROC.class, fi, constants$768.PFNGLTEXCOORD2HNVPROC$FUNC, session);
    }
    static PFNGLTEXCOORD2HNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _s, short _t) -> {
            try {
                constants$768.PFNGLTEXCOORD2HNVPROC$MH.invokeExact((Addressable)symbol, _s, _t);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


