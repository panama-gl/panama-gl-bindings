// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPASSTHROUGHXOESPROC {

    void apply(int token);
    static MemorySegment allocate(PFNGLPASSTHROUGHXOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPASSTHROUGHXOESPROC.class, fi, constants$598.PFNGLPASSTHROUGHXOESPROC$FUNC, session);
    }
    static PFNGLPASSTHROUGHXOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _token) -> {
            try {
                constants$598.PFNGLPASSTHROUGHXOESPROC$MH.invokeExact((Addressable)symbol, _token);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


