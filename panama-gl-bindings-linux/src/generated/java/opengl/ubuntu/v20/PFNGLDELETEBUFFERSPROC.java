// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDELETEBUFFERSPROC {

    void apply(int n, java.lang.foreign.MemoryAddress buffers);
    static MemorySegment allocate(PFNGLDELETEBUFFERSPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDELETEBUFFERSPROC.class, fi, constants$110.PFNGLDELETEBUFFERSPROC$FUNC, session);
    }
    static PFNGLDELETEBUFFERSPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _buffers) -> {
            try {
                constants$110.PFNGLDELETEBUFFERSPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_buffers);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


