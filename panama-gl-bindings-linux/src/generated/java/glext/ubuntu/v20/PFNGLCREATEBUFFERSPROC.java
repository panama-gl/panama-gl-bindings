// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCREATEBUFFERSPROC {

    void apply(int n, java.lang.foreign.MemoryAddress buffers);
    static MemorySegment allocate(PFNGLCREATEBUFFERSPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCREATEBUFFERSPROC.class, fi, constants$361.PFNGLCREATEBUFFERSPROC$FUNC, session);
    }
    static PFNGLCREATEBUFFERSPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _buffers) -> {
            try {
                constants$361.PFNGLCREATEBUFFERSPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_buffers);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


