// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETSAMPLERPARAMETERFVPROC {

    void apply(int sampler, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETSAMPLERPARAMETERFVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETSAMPLERPARAMETERFVPROC.class, fi, constants$235.PFNGLGETSAMPLERPARAMETERFVPROC$FUNC, session);
    }
    static PFNGLGETSAMPLERPARAMETERFVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _sampler, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$235.PFNGLGETSAMPLERPARAMETERFVPROC$MH.invokeExact((Addressable)symbol, _sampler, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


