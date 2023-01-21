// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPASSTEXCOORDATIPROC {

    void apply(int dst, int coord, int swizzle);
    static MemorySegment allocate(PFNGLPASSTEXCOORDATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPASSTEXCOORDATIPROC.class, fi, constants$490.PFNGLPASSTEXCOORDATIPROC$FUNC, session);
    }
    static PFNGLPASSTEXCOORDATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dst, int _coord, int _swizzle) -> {
            try {
                constants$490.PFNGLPASSTEXCOORDATIPROC$MH.invokeExact((Addressable)symbol, _dst, _coord, _swizzle);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


