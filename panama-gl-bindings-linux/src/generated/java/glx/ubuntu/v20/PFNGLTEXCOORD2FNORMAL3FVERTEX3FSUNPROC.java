// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC {

    void apply(float s, float t, float nx, float ny, float nz, float x, float y, float z);
    static MemorySegment allocate(PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC.class, fi, constants$1006.PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC$FUNC, session);
    }
    static PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _s, float _t, float _nx, float _ny, float _nz, float _x, float _y, float _z) -> {
            try {
                constants$1006.PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC$MH.invokeExact((Addressable)symbol, _s, _t, _nx, _ny, _nz, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

