// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETCOMPRESSEDTEXIMAGEPROC {

    void apply(int target, int level, java.lang.foreign.MemoryAddress img);
    static MemorySegment allocate(PFNGLGETCOMPRESSEDTEXIMAGEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETCOMPRESSEDTEXIMAGEPROC.class, fi, constants$159.PFNGLGETCOMPRESSEDTEXIMAGEPROC$FUNC, session);
    }
    static PFNGLGETCOMPRESSEDTEXIMAGEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, java.lang.foreign.MemoryAddress _img) -> {
            try {
                constants$159.PFNGLGETCOMPRESSEDTEXIMAGEPROC$MH.invokeExact((Addressable)symbol, _target, _level, (java.lang.foreign.Addressable)_img);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

