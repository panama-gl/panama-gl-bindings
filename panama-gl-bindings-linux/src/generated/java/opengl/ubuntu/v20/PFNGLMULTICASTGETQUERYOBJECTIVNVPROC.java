// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTICASTGETQUERYOBJECTIVNVPROC {

    void apply(int gpu, int id, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLMULTICASTGETQUERYOBJECTIVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTICASTGETQUERYOBJECTIVNVPROC.class, fi, constants$756.PFNGLMULTICASTGETQUERYOBJECTIVNVPROC$FUNC, session);
    }
    static PFNGLMULTICASTGETQUERYOBJECTIVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _gpu, int _id, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$756.PFNGLMULTICASTGETQUERYOBJECTIVNVPROC$MH.invokeExact((Addressable)symbol, _gpu, _id, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


