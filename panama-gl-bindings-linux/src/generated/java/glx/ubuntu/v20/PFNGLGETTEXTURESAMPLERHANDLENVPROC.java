// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTEXTURESAMPLERHANDLENVPROC {

    long apply(int texture, int sampler);
    static MemorySegment allocate(PFNGLGETTEXTURESAMPLERHANDLENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURESAMPLERHANDLENVPROC.class, fi, constants$812.PFNGLGETTEXTURESAMPLERHANDLENVPROC$FUNC, session);
    }
    static PFNGLGETTEXTURESAMPLERHANDLENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _sampler) -> {
            try {
                return (long)constants$812.PFNGLGETTEXTURESAMPLERHANDLENVPROC$MH.invokeExact((Addressable)symbol, _texture, _sampler);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


