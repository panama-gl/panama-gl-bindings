// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROC {

    void apply(int program, int target, int index, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROC.class, fi, constants$810.PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROC$FUNC, session);
    }
    static PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _target, int _index, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$810.PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROC$MH.invokeExact((Addressable)symbol, _program, _target, _index, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


