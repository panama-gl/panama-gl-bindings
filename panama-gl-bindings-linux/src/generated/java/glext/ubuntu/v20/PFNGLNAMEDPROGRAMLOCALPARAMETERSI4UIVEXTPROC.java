// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROC {

    void apply(int program, int target, int index, int count, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROC.class, fi, constants$810.PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROC$FUNC, session);
    }
    static PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _target, int _index, int _count, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$810.PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROC$MH.invokeExact((Addressable)symbol, _program, _target, _index, _count, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

