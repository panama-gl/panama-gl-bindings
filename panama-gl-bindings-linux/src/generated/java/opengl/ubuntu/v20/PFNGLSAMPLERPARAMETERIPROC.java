// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSAMPLERPARAMETERIPROC {

    void apply(int sampler, int pname, int param);
    static MemorySegment allocate(PFNGLSAMPLERPARAMETERIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLERPARAMETERIPROC.class, fi, constants$186.PFNGLSAMPLERPARAMETERIPROC$FUNC, session);
    }
    static PFNGLSAMPLERPARAMETERIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _sampler, int _pname, int _param) -> {
            try {
                constants$186.PFNGLSAMPLERPARAMETERIPROC$MH.invokeExact((Addressable)symbol, _sampler, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


