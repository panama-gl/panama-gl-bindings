// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC {

    void apply(int stage, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC.class, fi, constants$1179.PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC$FUNC, session);
    }
    static PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stage, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$1179.PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC$MH.invokeExact((Addressable)symbol, _stage, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


