// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXATTACHMEMORYNVPROC {

    void apply(int target, int memory, long offset);
    static MemorySegment allocate(PFNGLTEXATTACHMEMORYNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXATTACHMEMORYNVPROC.class, fi, constants$780.PFNGLTEXATTACHMEMORYNVPROC$FUNC, session);
    }
    static PFNGLTEXATTACHMEMORYNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _memory, long _offset) -> {
            try {
                constants$780.PFNGLTEXATTACHMEMORYNVPROC$MH.invokeExact((Addressable)symbol, _target, _memory, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


