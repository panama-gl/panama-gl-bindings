// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSTENCILSTROKEPATHNVPROC {

    void apply(int path, int reference, int mask);
    static MemorySegment allocate(PFNGLSTENCILSTROKEPATHNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILSTROKEPATHNVPROC.class, fi, constants$793.PFNGLSTENCILSTROKEPATHNVPROC$FUNC, session);
    }
    static PFNGLSTENCILSTROKEPATHNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path, int _reference, int _mask) -> {
            try {
                constants$793.PFNGLSTENCILSTROKEPATHNVPROC$MH.invokeExact((Addressable)symbol, _path, _reference, _mask);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


