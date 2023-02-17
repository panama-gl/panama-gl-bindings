// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYMULTITEXIMAGE2DEXTPROC {

    void apply(int texunit, int target, int level, int internalformat, int x, int y, int width, int height, int border);
    static MemorySegment allocate(PFNGLCOPYMULTITEXIMAGE2DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYMULTITEXIMAGE2DEXTPROC.class, fi, constants$778.PFNGLCOPYMULTITEXIMAGE2DEXTPROC$FUNC, session);
    }
    static PFNGLCOPYMULTITEXIMAGE2DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texunit, int _target, int _level, int _internalformat, int _x, int _y, int _width, int _height, int _border) -> {
            try {
                constants$778.PFNGLCOPYMULTITEXIMAGE2DEXTPROC$MH.invokeExact((Addressable)symbol, _texunit, _target, _level, _internalformat, _x, _y, _width, _height, _border);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


