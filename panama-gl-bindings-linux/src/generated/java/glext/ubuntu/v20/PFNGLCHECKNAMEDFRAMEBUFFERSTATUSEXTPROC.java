// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC {

    int apply(int framebuffer, int target);
    static MemorySegment allocate(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC.class, fi, constants$595.PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC$FUNC, session);
    }
    static PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _target) -> {
            try {
                return (int)constants$595.PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _target);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


