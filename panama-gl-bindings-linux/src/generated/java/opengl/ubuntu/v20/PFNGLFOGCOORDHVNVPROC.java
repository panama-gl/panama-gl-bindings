// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFOGCOORDHVNVPROC {

    void apply(java.lang.foreign.MemoryAddress fog);
    static MemorySegment allocate(PFNGLFOGCOORDHVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDHVNVPROC.class, fi, constants$773.PFNGLFOGCOORDHVNVPROC$FUNC, session);
    }
    static PFNGLFOGCOORDHVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _fog) -> {
            try {
                constants$773.PFNGLFOGCOORDHVNVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_fog);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


