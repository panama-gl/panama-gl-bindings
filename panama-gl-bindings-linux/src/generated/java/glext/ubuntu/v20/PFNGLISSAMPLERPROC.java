// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISSAMPLERPROC {

    byte apply(int sampler);
    static MemorySegment allocate(PFNGLISSAMPLERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISSAMPLERPROC.class, fi, constants$232.PFNGLISSAMPLERPROC$FUNC, session);
    }
    static PFNGLISSAMPLERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _sampler) -> {
            try {
                return (byte)constants$232.PFNGLISSAMPLERPROC$MH.invokeExact((Addressable)symbol, _sampler);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


