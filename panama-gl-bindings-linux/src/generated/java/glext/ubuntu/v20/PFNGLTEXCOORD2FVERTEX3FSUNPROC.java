// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD2FVERTEX3FSUNPROC {

    void apply(float s, float t, float x, float y, float z);
    static MemorySegment allocate(PFNGLTEXCOORD2FVERTEX3FSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2FVERTEX3FSUNPROC.class, fi, constants$1329.PFNGLTEXCOORD2FVERTEX3FSUNPROC$FUNC, session);
    }
    static PFNGLTEXCOORD2FVERTEX3FSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _s, float _t, float _x, float _y, float _z) -> {
            try {
                constants$1329.PFNGLTEXCOORD2FVERTEX3FSUNPROC$MH.invokeExact((Addressable)symbol, _s, _t, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

