// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDSAMPLERPROC {

    void apply(int unit, int sampler);
    static MemorySegment allocate(PFNGLBINDSAMPLERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDSAMPLERPROC.class, fi, constants$271.PFNGLBINDSAMPLERPROC$FUNC, session);
    }
    static PFNGLBINDSAMPLERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _unit, int _sampler) -> {
            try {
                constants$271.PFNGLBINDSAMPLERPROC$MH.invokeExact((Addressable)symbol, _unit, _sampler);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


