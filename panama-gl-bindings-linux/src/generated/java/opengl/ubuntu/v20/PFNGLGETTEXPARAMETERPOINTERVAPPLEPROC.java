// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC {

    void apply(int target, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC.class, fi, constants$481.PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC$FUNC, session);
    }
    static PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$481.PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC$MH.invokeExact((Addressable)symbol, _target, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


