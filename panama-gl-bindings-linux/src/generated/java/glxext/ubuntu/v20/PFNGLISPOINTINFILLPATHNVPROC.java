// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISPOINTINFILLPATHNVPROC {

    byte apply(int path, int mask, float x, float y);
    static MemorySegment allocate(PFNGLISPOINTINFILLPATHNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISPOINTINFILLPATHNVPROC.class, fi, constants$884.PFNGLISPOINTINFILLPATHNVPROC$FUNC, session);
    }
    static PFNGLISPOINTINFILLPATHNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path, int _mask, float _x, float _y) -> {
            try {
                return (byte)constants$884.PFNGLISPOINTINFILLPATHNVPROC$MH.invokeExact((Addressable)symbol, _path, _mask, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


