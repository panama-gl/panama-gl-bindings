// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS4SMESAPROC {

    void apply(short x, short y, short z, short w);
    static MemorySegment allocate(PFNGLWINDOWPOS4SMESAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS4SMESAPROC.class, fi, constants$804.PFNGLWINDOWPOS4SMESAPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS4SMESAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _x, short _y, short _z, short _w) -> {
            try {
                constants$804.PFNGLWINDOWPOS4SMESAPROC$MH.invokeExact((Addressable)symbol, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


