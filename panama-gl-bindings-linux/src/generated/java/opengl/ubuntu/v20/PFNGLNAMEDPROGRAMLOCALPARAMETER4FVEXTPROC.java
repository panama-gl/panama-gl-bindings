// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROC {

    void apply(int program, int target, int index, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROC.class, fi, constants$592.PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROC$FUNC, session);
    }
    static PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _target, int _index, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$592.PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROC$MH.invokeExact((Addressable)symbol, _program, _target, _index, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


