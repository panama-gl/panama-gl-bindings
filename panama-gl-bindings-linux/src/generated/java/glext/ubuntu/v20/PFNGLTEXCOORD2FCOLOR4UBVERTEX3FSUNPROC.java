// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC {

    void apply(float s, float t, byte r, byte g, byte b, byte a, float x, float y, float z);
    static MemorySegment allocate(PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC.class, fi, constants$920.PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC$FUNC, session);
    }
    static PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _s, float _t, byte _r, byte _g, byte _b, byte _a, float _x, float _y, float _z) -> {
            try {
                constants$920.PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC$MH.invokeExact((Addressable)symbol, _s, _t, _r, _g, _b, _a, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


