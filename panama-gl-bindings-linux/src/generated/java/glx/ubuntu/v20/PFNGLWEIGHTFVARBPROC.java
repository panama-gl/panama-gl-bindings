// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWEIGHTFVARBPROC {

    void apply(int size, java.lang.foreign.MemoryAddress weights);
    static MemorySegment allocate(PFNGLWEIGHTFVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWEIGHTFVARBPROC.class, fi, constants$464.PFNGLWEIGHTFVARBPROC$FUNC, session);
    }
    static PFNGLWEIGHTFVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _size, java.lang.foreign.MemoryAddress _weights) -> {
            try {
                constants$464.PFNGLWEIGHTFVARBPROC$MH.invokeExact((Addressable)symbol, _size, (java.lang.foreign.Addressable)_weights);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


