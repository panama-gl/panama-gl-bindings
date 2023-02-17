// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMATRIXORTHOEXTPROC {

    void apply(int mode, double left, double right, double bottom, double top, double zNear, double zFar);
    static MemorySegment allocate(PFNGLMATRIXORTHOEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXORTHOEXTPROC.class, fi, constants$761.PFNGLMATRIXORTHOEXTPROC$FUNC, session);
    }
    static PFNGLMATRIXORTHOEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, double _left, double _right, double _bottom, double _top, double _zNear, double _zFar) -> {
            try {
                constants$761.PFNGLMATRIXORTHOEXTPROC$MH.invokeExact((Addressable)symbol, _mode, _left, _right, _bottom, _top, _zNear, _zFar);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


