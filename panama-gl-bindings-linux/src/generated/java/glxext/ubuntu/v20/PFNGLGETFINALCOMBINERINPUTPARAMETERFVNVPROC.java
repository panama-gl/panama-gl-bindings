// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC {

    void apply(int variable, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC.class, fi, constants$902.PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC$FUNC, session);
    }
    static PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _variable, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$902.PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC$MH.invokeExact((Addressable)symbol, _variable, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


