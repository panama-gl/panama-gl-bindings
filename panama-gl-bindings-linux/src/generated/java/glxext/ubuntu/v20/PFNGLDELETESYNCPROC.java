// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDELETESYNCPROC {

    void apply(java.lang.foreign.MemoryAddress sync);
    static MemorySegment allocate(PFNGLDELETESYNCPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDELETESYNCPROC.class, fi, constants$266.PFNGLDELETESYNCPROC$FUNC, session);
    }
    static PFNGLDELETESYNCPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _sync) -> {
            try {
                constants$266.PFNGLDELETESYNCPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_sync);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


