// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS2IPROC {

    void apply(int x, int y);
    static MemorySegment allocate(PFNGLWINDOWPOS2IPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2IPROC.class, fi, constants$102.PFNGLWINDOWPOS2IPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS2IPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _x, int _y) -> {
            try {
                constants$102.PFNGLWINDOWPOS2IPROC$MH.invokeExact((Addressable)symbol, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


