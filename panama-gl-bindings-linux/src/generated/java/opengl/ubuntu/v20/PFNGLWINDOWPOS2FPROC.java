// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS2FPROC {

    void apply(float x, float y);
    static MemorySegment allocate(PFNGLWINDOWPOS2FPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2FPROC.class, fi, constants$101.PFNGLWINDOWPOS2FPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS2FPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _x, float _y) -> {
            try {
                constants$101.PFNGLWINDOWPOS2FPROC$MH.invokeExact((Addressable)symbol, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


