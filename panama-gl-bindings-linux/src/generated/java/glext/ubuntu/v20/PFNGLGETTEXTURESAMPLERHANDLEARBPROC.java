// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTEXTURESAMPLERHANDLEARBPROC {

    long apply(int texture, int sampler);
    static MemorySegment allocate(PFNGLGETTEXTURESAMPLERHANDLEARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURESAMPLERHANDLEARBPROC.class, fi, constants$423.PFNGLGETTEXTURESAMPLERHANDLEARBPROC$FUNC, session);
    }
    static PFNGLGETTEXTURESAMPLERHANDLEARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _sampler) -> {
            try {
                return (long)constants$423.PFNGLGETTEXTURESAMPLERHANDLEARBPROC$MH.invokeExact((Addressable)symbol, _texture, _sampler);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

