// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDRENDERBUFFERPROC {

    void apply(int target, int renderbuffer);
    static MemorySegment allocate(PFNGLBINDRENDERBUFFERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDRENDERBUFFERPROC.class, fi, constants$166.PFNGLBINDRENDERBUFFERPROC$FUNC, session);
    }
    static PFNGLBINDRENDERBUFFERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _renderbuffer) -> {
            try {
                constants$166.PFNGLBINDRENDERBUFFERPROC$MH.invokeExact((Addressable)symbol, _target, _renderbuffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


