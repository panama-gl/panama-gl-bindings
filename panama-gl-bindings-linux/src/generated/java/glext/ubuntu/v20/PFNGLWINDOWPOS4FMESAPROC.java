// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS4FMESAPROC {

    void apply(float x, float y, float z, float w);
    static MemorySegment allocate(PFNGLWINDOWPOS4FMESAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS4FMESAPROC.class, fi, constants$718.PFNGLWINDOWPOS4FMESAPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS4FMESAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _x, float _y, float _z, float _w) -> {
            try {
                constants$718.PFNGLWINDOWPOS4FMESAPROC$MH.invokeExact((Addressable)symbol, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


