// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFOGCOORDFVPROC {

    void apply(java.lang.foreign.MemoryAddress coord);
    static MemorySegment allocate(PFNGLFOGCOORDFVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDFVPROC.class, fi, constants$94.PFNGLFOGCOORDFVPROC$FUNC, session);
    }
    static PFNGLFOGCOORDFVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _coord) -> {
            try {
                constants$94.PFNGLFOGCOORDFVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_coord);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


