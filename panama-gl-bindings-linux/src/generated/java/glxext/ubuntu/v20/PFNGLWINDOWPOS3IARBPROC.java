// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS3IARBPROC {

    void apply(int x, int y, int z);
    static MemorySegment allocate(PFNGLWINDOWPOS3IARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3IARBPROC.class, fi, constants$489.PFNGLWINDOWPOS3IARBPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS3IARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _x, int _y, int _z) -> {
            try {
                constants$489.PFNGLWINDOWPOS3IARBPROC$MH.invokeExact((Addressable)symbol, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


