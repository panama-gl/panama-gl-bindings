// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC {

    void apply(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);
    static MemorySegment allocate(PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC.class, fi, constants$781.PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC$FUNC, session);
    }
    static PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texunit, int _target, int _level, int _xoffset, int _yoffset, int _zoffset, int _x, int _y, int _width, int _height) -> {
            try {
                constants$782.PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC$MH.invokeExact((Addressable)symbol, _texunit, _target, _level, _xoffset, _yoffset, _zoffset, _x, _y, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


