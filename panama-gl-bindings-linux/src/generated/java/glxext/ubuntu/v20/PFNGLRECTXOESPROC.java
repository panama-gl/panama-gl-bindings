// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLRECTXOESPROC {

    void apply(int x1, int y1, int x2, int y2);
    static MemorySegment allocate(PFNGLRECTXOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLRECTXOESPROC.class, fi, constants$527.PFNGLRECTXOESPROC$FUNC, session);
    }
    static PFNGLRECTXOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _x1, int _y1, int _x2, int _y2) -> {
            try {
                constants$527.PFNGLRECTXOESPROC$MH.invokeExact((Addressable)symbol, _x1, _y1, _x2, _y2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


