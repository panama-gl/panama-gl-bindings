// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXSUBIMAGE2DEXTPROC {

    void apply(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.lang.foreign.MemoryAddress pixels);
    static MemorySegment allocate(PFNGLTEXSUBIMAGE2DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXSUBIMAGE2DEXTPROC.class, fi, constants$752.PFNGLTEXSUBIMAGE2DEXTPROC$FUNC, session);
    }
    static PFNGLTEXSUBIMAGE2DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _xoffset, int _yoffset, int _width, int _height, int _format, int _type, java.lang.foreign.MemoryAddress _pixels) -> {
            try {
                constants$752.PFNGLTEXSUBIMAGE2DEXTPROC$MH.invokeExact((Addressable)symbol, _target, _level, _xoffset, _yoffset, _width, _height, _format, _type, (java.lang.foreign.Addressable)_pixels);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


