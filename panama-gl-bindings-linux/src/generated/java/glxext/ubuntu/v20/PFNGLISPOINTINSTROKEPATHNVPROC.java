// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISPOINTINSTROKEPATHNVPROC {

    byte apply(int path, float x, float y);
    static MemorySegment allocate(PFNGLISPOINTINSTROKEPATHNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISPOINTINSTROKEPATHNVPROC.class, fi, constants$884.PFNGLISPOINTINSTROKEPATHNVPROC$FUNC, session);
    }
    static PFNGLISPOINTINSTROKEPATHNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path, float _x, float _y) -> {
            try {
                return (byte)constants$884.PFNGLISPOINTINSTROKEPATHNVPROC$MH.invokeExact((Addressable)symbol, _path, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


