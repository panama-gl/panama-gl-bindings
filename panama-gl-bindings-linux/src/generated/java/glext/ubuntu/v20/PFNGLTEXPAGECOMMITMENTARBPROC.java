// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXPAGECOMMITMENTARBPROC {

    void apply(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, byte commit);
    static MemorySegment allocate(PFNGLTEXPAGECOMMITMENTARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXPAGECOMMITMENTARBPROC.class, fi, constants$514.PFNGLTEXPAGECOMMITMENTARBPROC$FUNC, session);
    }
    static PFNGLTEXPAGECOMMITMENTARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _xoffset, int _yoffset, int _zoffset, int _width, int _height, int _depth, byte _commit) -> {
            try {
                constants$514.PFNGLTEXPAGECOMMITMENTARBPROC$MH.invokeExact((Addressable)symbol, _target, _level, _xoffset, _yoffset, _zoffset, _width, _height, _depth, _commit);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


