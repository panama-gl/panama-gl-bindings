// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFENCESYNCPROC {

    java.lang.foreign.Addressable apply(int condition, int flags);
    static MemorySegment allocate(PFNGLFENCESYNCPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFENCESYNCPROC.class, fi, constants$180.PFNGLFENCESYNCPROC$FUNC, session);
    }
    static PFNGLFENCESYNCPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _condition, int _flags) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$180.PFNGLFENCESYNCPROC$MH.invokeExact((Addressable)symbol, _condition, _flags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


