// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISENABLEDIPROC {

    byte apply(int target, int index);
    static MemorySegment allocate(PFNGLISENABLEDIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISENABLEDIPROC.class, fi, constants$148.PFNGLISENABLEDIPROC$FUNC, session);
    }
    static PFNGLISENABLEDIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index) -> {
            try {
                return (byte)constants$148.PFNGLISENABLEDIPROC$MH.invokeExact((Addressable)symbol, _target, _index);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


