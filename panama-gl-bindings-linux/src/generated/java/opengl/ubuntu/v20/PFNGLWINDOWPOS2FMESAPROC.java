// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS2FMESAPROC {

    void apply(float x, float y);
    static MemorySegment allocate(PFNGLWINDOWPOS2FMESAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2FMESAPROC.class, fi, constants$712.PFNGLWINDOWPOS2FMESAPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS2FMESAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _x, float _y) -> {
            try {
                constants$712.PFNGLWINDOWPOS2FMESAPROC$MH.invokeExact((Addressable)symbol, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


