// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS3SARBPROC {

    void apply(short x, short y, short z);
    static MemorySegment allocate(PFNGLWINDOWPOS3SARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3SARBPROC.class, fi, constants$490.PFNGLWINDOWPOS3SARBPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS3SARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _x, short _y, short _z) -> {
            try {
                constants$490.PFNGLWINDOWPOS3SARBPROC$MH.invokeExact((Addressable)symbol, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


