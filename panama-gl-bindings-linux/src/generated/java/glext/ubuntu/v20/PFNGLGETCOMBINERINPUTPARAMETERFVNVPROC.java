// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC {

    void apply(int stage, int portion, int variable, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC.class, fi, constants$1175.PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC$FUNC, session);
    }
    static PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stage, int _portion, int _variable, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$1175.PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC$MH.invokeExact((Addressable)symbol, _stage, _portion, _variable, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

