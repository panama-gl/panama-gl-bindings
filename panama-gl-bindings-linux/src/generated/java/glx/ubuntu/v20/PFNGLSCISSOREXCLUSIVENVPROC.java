// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSCISSOREXCLUSIVENVPROC {

    void apply(int x, int y, int width, int height);
    static MemorySegment allocate(PFNGLSCISSOREXCLUSIVENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSCISSOREXCLUSIVENVPROC.class, fi, constants$904.PFNGLSCISSOREXCLUSIVENVPROC$FUNC, session);
    }
    static PFNGLSCISSOREXCLUSIVENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _x, int _y, int _width, int _height) -> {
            try {
                constants$904.PFNGLSCISSOREXCLUSIVENVPROC$MH.invokeExact((Addressable)symbol, _x, _y, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


