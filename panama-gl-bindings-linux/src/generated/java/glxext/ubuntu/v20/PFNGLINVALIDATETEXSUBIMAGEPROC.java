// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINVALIDATETEXSUBIMAGEPROC {

    void apply(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth);
    static MemorySegment allocate(PFNGLINVALIDATETEXSUBIMAGEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATETEXSUBIMAGEPROC.class, fi, constants$341.PFNGLINVALIDATETEXSUBIMAGEPROC$FUNC, session);
    }
    static PFNGLINVALIDATETEXSUBIMAGEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _level, int _xoffset, int _yoffset, int _zoffset, int _width, int _height, int _depth) -> {
            try {
                constants$341.PFNGLINVALIDATETEXSUBIMAGEPROC$MH.invokeExact((Addressable)symbol, _texture, _level, _xoffset, _yoffset, _zoffset, _width, _height, _depth);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


