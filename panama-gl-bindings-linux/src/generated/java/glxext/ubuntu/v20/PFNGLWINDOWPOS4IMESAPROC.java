// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS4IMESAPROC {

    void apply(int x, int y, int z, int w);
    static MemorySegment allocate(PFNGLWINDOWPOS4IMESAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS4IMESAPROC.class, fi, constants$804.PFNGLWINDOWPOS4IMESAPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS4IMESAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _x, int _y, int _z, int _w) -> {
            try {
                constants$804.PFNGLWINDOWPOS4IMESAPROC$MH.invokeExact((Addressable)symbol, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


