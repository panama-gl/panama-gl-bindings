// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS3FARBPROC {

    void apply(float x, float y, float z);
    static MemorySegment allocate(PFNGLWINDOWPOS3FARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3FARBPROC.class, fi, constants$557.PFNGLWINDOWPOS3FARBPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS3FARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _x, float _y, float _z) -> {
            try {
                constants$557.PFNGLWINDOWPOS3FARBPROC$MH.invokeExact((Addressable)symbol, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


