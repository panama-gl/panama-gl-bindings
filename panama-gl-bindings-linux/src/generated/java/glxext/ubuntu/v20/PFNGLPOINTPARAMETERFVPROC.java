// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPOINTPARAMETERFVPROC {

    void apply(int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLPOINTPARAMETERFVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPOINTPARAMETERFVPROC.class, fi, constants$178.PFNGLPOINTPARAMETERFVPROC$FUNC, session);
    }
    static PFNGLPOINTPARAMETERFVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$178.PFNGLPOINTPARAMETERFVPROC$MH.invokeExact((Addressable)symbol, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


