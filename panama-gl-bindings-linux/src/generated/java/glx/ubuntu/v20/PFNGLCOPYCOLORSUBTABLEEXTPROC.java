// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYCOLORSUBTABLEEXTPROC {

    void apply(int target, int start, int x, int y, int width);
    static MemorySegment allocate(PFNGLCOPYCOLORSUBTABLEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYCOLORSUBTABLEEXTPROC.class, fi, constants$604.PFNGLCOPYCOLORSUBTABLEEXTPROC$FUNC, session);
    }
    static PFNGLCOPYCOLORSUBTABLEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _start, int _x, int _y, int _width) -> {
            try {
                constants$604.PFNGLCOPYCOLORSUBTABLEEXTPROC$MH.invokeExact((Addressable)symbol, _target, _start, _x, _y, _width);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


