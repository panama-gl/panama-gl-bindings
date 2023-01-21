// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXIMAGE3DEXTPROC {

    void apply(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, java.lang.foreign.MemoryAddress pixels);
    static MemorySegment allocate(PFNGLTEXIMAGE3DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXIMAGE3DEXTPROC.class, fi, constants$752.PFNGLTEXIMAGE3DEXTPROC$FUNC, session);
    }
    static PFNGLTEXIMAGE3DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _internalformat, int _width, int _height, int _depth, int _border, int _format, int _type, java.lang.foreign.MemoryAddress _pixels) -> {
            try {
                constants$752.PFNGLTEXIMAGE3DEXTPROC$MH.invokeExact((Addressable)symbol, _target, _level, _internalformat, _width, _height, _depth, _border, _format, _type, (java.lang.foreign.Addressable)_pixels);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


