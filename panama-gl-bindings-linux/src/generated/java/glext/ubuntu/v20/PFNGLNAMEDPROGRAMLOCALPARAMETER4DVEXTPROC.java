// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROC {

    void apply(int program, int target, int index, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROC.class, fi, constants$813.PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROC$FUNC, session);
    }
    static PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _target, int _index, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$813.PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROC$MH.invokeExact((Addressable)symbol, _program, _target, _index, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


