// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSAMPLERPARAMETERIVPROC {

    void apply(int sampler, int pname, java.lang.foreign.MemoryAddress param);
    static MemorySegment allocate(PFNGLSAMPLERPARAMETERIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLERPARAMETERIVPROC.class, fi, constants$187.PFNGLSAMPLERPARAMETERIVPROC$FUNC, session);
    }
    static PFNGLSAMPLERPARAMETERIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _sampler, int _pname, java.lang.foreign.MemoryAddress _param) -> {
            try {
                constants$187.PFNGLSAMPLERPARAMETERIVPROC$MH.invokeExact((Addressable)symbol, _sampler, _pname, (java.lang.foreign.Addressable)_param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


