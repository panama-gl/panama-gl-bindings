// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC {

    void apply(int program, int target, int index, int count, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC.class, fi, constants$808.PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC$FUNC, session);
    }
    static PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _target, int _index, int _count, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$808.PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC$MH.invokeExact((Addressable)symbol, _program, _target, _index, _count, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

