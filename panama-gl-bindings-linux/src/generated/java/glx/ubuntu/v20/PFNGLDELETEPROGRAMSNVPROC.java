// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDELETEPROGRAMSNVPROC {

    void apply(int n, java.lang.foreign.MemoryAddress programs);
    static MemorySegment allocate(PFNGLDELETEPROGRAMSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDELETEPROGRAMSNVPROC.class, fi, constants$935.PFNGLDELETEPROGRAMSNVPROC$FUNC, session);
    }
    static PFNGLDELETEPROGRAMSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _programs) -> {
            try {
                constants$935.PFNGLDELETEPROGRAMSNVPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_programs);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


