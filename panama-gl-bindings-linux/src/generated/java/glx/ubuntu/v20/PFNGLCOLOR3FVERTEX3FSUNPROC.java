// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOLOR3FVERTEX3FSUNPROC {

    void apply(float r, float g, float b, float x, float y, float z);
    static MemorySegment allocate(PFNGLCOLOR3FVERTEX3FSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR3FVERTEX3FSUNPROC.class, fi, constants$1002.PFNGLCOLOR3FVERTEX3FSUNPROC$FUNC, session);
    }
    static PFNGLCOLOR3FVERTEX3FSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _r, float _g, float _b, float _x, float _y, float _z) -> {
            try {
                constants$1002.PFNGLCOLOR3FVERTEX3FSUNPROC$MH.invokeExact((Addressable)symbol, _r, _g, _b, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


