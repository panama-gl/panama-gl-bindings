// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGENFRAMEBUFFERSEXTPROC {

    void apply(int n, java.lang.foreign.MemoryAddress framebuffers);
    static MemorySegment allocate(PFNGLGENFRAMEBUFFERSEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGENFRAMEBUFFERSEXTPROC.class, fi, constants$713.PFNGLGENFRAMEBUFFERSEXTPROC$FUNC, session);
    }
    static PFNGLGENFRAMEBUFFERSEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _framebuffers) -> {
            try {
                constants$713.PFNGLGENFRAMEBUFFERSEXTPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_framebuffers);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


