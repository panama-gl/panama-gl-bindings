// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMPARAMETERS4DVNVPROC {

    void apply(int target, int index, int count, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLPROGRAMPARAMETERS4DVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMPARAMETERS4DVNVPROC.class, fi, constants$856.PFNGLPROGRAMPARAMETERS4DVNVPROC$FUNC, session);
    }
    static PFNGLPROGRAMPARAMETERS4DVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, int _count, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$856.PFNGLPROGRAMPARAMETERS4DVNVPROC$MH.invokeExact((Addressable)symbol, _target, _index, _count, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


