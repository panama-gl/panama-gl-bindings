// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETCOMPRESSEDTEXIMAGEARBPROC {

    void apply(int target, int level, java.lang.foreign.MemoryAddress img);
    static MemorySegment allocate(PFNGLGETCOMPRESSEDTEXIMAGEARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETCOMPRESSEDTEXIMAGEARBPROC.class, fi, constants$461.PFNGLGETCOMPRESSEDTEXIMAGEARBPROC$FUNC, session);
    }
    static PFNGLGETCOMPRESSEDTEXIMAGEARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, java.lang.foreign.MemoryAddress _img) -> {
            try {
                constants$461.PFNGLGETCOMPRESSEDTEXIMAGEARBPROC$MH.invokeExact((Addressable)symbol, _target, _level, (java.lang.foreign.Addressable)_img);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


