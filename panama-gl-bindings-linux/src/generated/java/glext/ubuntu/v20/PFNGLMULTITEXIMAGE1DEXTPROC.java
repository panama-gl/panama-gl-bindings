// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXIMAGE1DEXTPROC {

    void apply(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, java.lang.foreign.MemoryAddress pixels);
    static MemorySegment allocate(PFNGLMULTITEXIMAGE1DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXIMAGE1DEXTPROC.class, fi, constants$776.PFNGLMULTITEXIMAGE1DEXTPROC$FUNC, session);
    }
    static PFNGLMULTITEXIMAGE1DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texunit, int _target, int _level, int _internalformat, int _width, int _border, int _format, int _type, java.lang.foreign.MemoryAddress _pixels) -> {
            try {
                constants$777.PFNGLMULTITEXIMAGE1DEXTPROC$MH.invokeExact((Addressable)symbol, _texunit, _target, _level, _internalformat, _width, _border, _format, _type, (java.lang.foreign.Addressable)_pixels);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


