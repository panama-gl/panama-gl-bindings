// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMATRIXMULT3X3FNVPROC {

    void apply(int matrixMode, java.lang.foreign.MemoryAddress m);
    static MemorySegment allocate(PFNGLMATRIXMULT3X3FNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXMULT3X3FNVPROC.class, fi, constants$887.PFNGLMATRIXMULT3X3FNVPROC$FUNC, session);
    }
    static PFNGLMATRIXMULT3X3FNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _matrixMode, java.lang.foreign.MemoryAddress _m) -> {
            try {
                constants$887.PFNGLMATRIXMULT3X3FNVPROC$MH.invokeExact((Addressable)symbol, _matrixMode, (java.lang.foreign.Addressable)_m);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


