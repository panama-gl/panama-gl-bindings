// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROC {

    void apply(int target, int index, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROC.class, fi, constants$759.PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROC$FUNC, session);
    }
    static PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$759.PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROC$MH.invokeExact((Addressable)symbol, _target, _index, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


