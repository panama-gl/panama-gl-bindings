// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPOINTSIZEXOESPROC {

    void apply(int size);
    static MemorySegment allocate(PFNGLPOINTSIZEXOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPOINTSIZEXOESPROC.class, fi, constants$422.PFNGLPOINTSIZEXOESPROC$FUNC, session);
    }
    static PFNGLPOINTSIZEXOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _size) -> {
            try {
                constants$422.PFNGLPOINTSIZEXOESPROC$MH.invokeExact((Addressable)symbol, _size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


