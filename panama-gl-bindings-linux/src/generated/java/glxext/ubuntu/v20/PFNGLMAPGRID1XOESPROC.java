// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAPGRID1XOESPROC {

    void apply(int n, int u1, int u2);
    static MemorySegment allocate(PFNGLMAPGRID1XOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAPGRID1XOESPROC.class, fi, constants$519.PFNGLMAPGRID1XOESPROC$FUNC, session);
    }
    static PFNGLMAPGRID1XOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, int _u1, int _u2) -> {
            try {
                constants$519.PFNGLMAPGRID1XOESPROC$MH.invokeExact((Addressable)symbol, _n, _u1, _u2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


