// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROC {

    void apply(int texunit, int target, int level, int xoffset, int x, int y, int width);
    static MemorySegment allocate(PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROC.class, fi, constants$557.PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROC$FUNC, session);
    }
    static PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texunit, int _target, int _level, int _xoffset, int _x, int _y, int _width) -> {
            try {
                constants$557.PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROC$MH.invokeExact((Addressable)symbol, _texunit, _target, _level, _xoffset, _x, _y, _width);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


