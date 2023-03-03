// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCLAMPCOLORPROC {

    void apply(int target, int clamp);
    static MemorySegment allocate(PFNGLCLAMPCOLORPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCLAMPCOLORPROC.class, fi, constants$235.PFNGLCLAMPCOLORPROC$FUNC, session);
    }
    static PFNGLCLAMPCOLORPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _clamp) -> {
            try {
                constants$235.PFNGLCLAMPCOLORPROC$MH.invokeExact((Addressable)symbol, _target, _clamp);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

