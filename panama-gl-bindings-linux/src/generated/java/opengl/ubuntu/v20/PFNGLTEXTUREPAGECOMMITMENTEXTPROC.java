// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTUREPAGECOMMITMENTEXTPROC {

    void apply(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, byte commit);
    static MemorySegment allocate(PFNGLTEXTUREPAGECOMMITMENTEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREPAGECOMMITMENTEXTPROC.class, fi, constants$620.PFNGLTEXTUREPAGECOMMITMENTEXTPROC$FUNC, session);
    }
    static PFNGLTEXTUREPAGECOMMITMENTEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _level, int _xoffset, int _yoffset, int _zoffset, int _width, int _height, int _depth, byte _commit) -> {
            try {
                constants$620.PFNGLTEXTUREPAGECOMMITMENTEXTPROC$MH.invokeExact((Addressable)symbol, _texture, _level, _xoffset, _yoffset, _zoffset, _width, _height, _depth, _commit);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


