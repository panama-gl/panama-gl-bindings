// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWEIGHTBVARBPROC {

    void apply(int size, java.lang.foreign.MemoryAddress weights);
    static MemorySegment allocate(PFNGLWEIGHTBVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWEIGHTBVARBPROC.class, fi, constants$463.PFNGLWEIGHTBVARBPROC$FUNC, session);
    }
    static PFNGLWEIGHTBVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _size, java.lang.foreign.MemoryAddress _weights) -> {
            try {
                constants$463.PFNGLWEIGHTBVARBPROC$MH.invokeExact((Addressable)symbol, _size, (java.lang.foreign.Addressable)_weights);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


