// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDBUFFEROFFSETNVPROC {

    void apply(int target, int index, int buffer, long offset);
    static MemorySegment allocate(PFNGLBINDBUFFEROFFSETNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFEROFFSETNVPROC.class, fi, constants$915.PFNGLBINDBUFFEROFFSETNVPROC$FUNC, session);
    }
    static PFNGLBINDBUFFEROFFSETNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, int _buffer, long _offset) -> {
            try {
                constants$915.PFNGLBINDBUFFEROFFSETNVPROC$MH.invokeExact((Addressable)symbol, _target, _index, _buffer, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


