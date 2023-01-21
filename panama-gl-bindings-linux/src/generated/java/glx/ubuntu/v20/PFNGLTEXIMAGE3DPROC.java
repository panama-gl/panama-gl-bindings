// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXIMAGE3DPROC {

    void apply(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, java.lang.foreign.MemoryAddress pixels);
    static MemorySegment allocate(PFNGLTEXIMAGE3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXIMAGE3DPROC.class, fi, constants$142.PFNGLTEXIMAGE3DPROC$FUNC, session);
    }
    static PFNGLTEXIMAGE3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _internalformat, int _width, int _height, int _depth, int _border, int _format, int _type, java.lang.foreign.MemoryAddress _pixels) -> {
            try {
                constants$142.PFNGLTEXIMAGE3DPROC$MH.invokeExact((Addressable)symbol, _target, _level, _internalformat, _width, _height, _depth, _border, _format, _type, (java.lang.foreign.Addressable)_pixels);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


