// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAXSHADERCOMPILERTHREADSARBPROC {

    void apply(int count);
    static MemorySegment allocate(PFNGLMAXSHADERCOMPILERTHREADSARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAXSHADERCOMPILERTHREADSARBPROC.class, fi, constants$348.PFNGLMAXSHADERCOMPILERTHREADSARBPROC$FUNC, session);
    }
    static PFNGLMAXSHADERCOMPILERTHREADSARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _count) -> {
            try {
                constants$348.PFNGLMAXSHADERCOMPILERTHREADSARBPROC$MH.invokeExact((Addressable)symbol, _count);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


