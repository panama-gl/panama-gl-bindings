// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYTEXSUBIMAGE3DPROC {

    void apply(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);
    static MemorySegment allocate(PFNGLCOPYTEXSUBIMAGE3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXSUBIMAGE3DPROC.class, fi, constants$143.PFNGLCOPYTEXSUBIMAGE3DPROC$FUNC, session);
    }
    static PFNGLCOPYTEXSUBIMAGE3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _xoffset, int _yoffset, int _zoffset, int _x, int _y, int _width, int _height) -> {
            try {
                constants$143.PFNGLCOPYTEXSUBIMAGE3DPROC$MH.invokeExact((Addressable)symbol, _target, _level, _xoffset, _yoffset, _zoffset, _x, _y, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


