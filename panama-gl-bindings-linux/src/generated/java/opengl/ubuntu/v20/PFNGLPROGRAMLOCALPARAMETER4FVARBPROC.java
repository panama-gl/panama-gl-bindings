// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMLOCALPARAMETER4FVARBPROC {

    void apply(int target, int index, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLPROGRAMLOCALPARAMETER4FVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMLOCALPARAMETER4FVARBPROC.class, fi, constants$326.PFNGLPROGRAMLOCALPARAMETER4FVARBPROC$FUNC, session);
    }
    static PFNGLPROGRAMLOCALPARAMETER4FVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$326.PFNGLPROGRAMLOCALPARAMETER4FVARBPROC$MH.invokeExact((Addressable)symbol, _target, _index, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


