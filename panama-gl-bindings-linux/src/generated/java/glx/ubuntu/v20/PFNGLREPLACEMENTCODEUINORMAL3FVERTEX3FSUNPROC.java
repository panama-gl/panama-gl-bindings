// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROC {

    void apply(int rc, float nx, float ny, float nz, float x, float y, float z);
    static MemorySegment allocate(PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROC.class, fi, constants$1010.PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROC$FUNC, session);
    }
    static PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _rc, float _nx, float _ny, float _nz, float _x, float _y, float _z) -> {
            try {
                constants$1010.PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROC$MH.invokeExact((Addressable)symbol, _rc, _nx, _ny, _nz, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


