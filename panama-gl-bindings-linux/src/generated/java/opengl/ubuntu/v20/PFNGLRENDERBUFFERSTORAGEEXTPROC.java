// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLRENDERBUFFERSTORAGEEXTPROC {

    void apply(int target, int internalformat, int width, int height);
    static MemorySegment allocate(PFNGLRENDERBUFFERSTORAGEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLRENDERBUFFERSTORAGEEXTPROC.class, fi, constants$626.PFNGLRENDERBUFFERSTORAGEEXTPROC$FUNC, session);
    }
    static PFNGLRENDERBUFFERSTORAGEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _internalformat, int _width, int _height) -> {
            try {
                constants$626.PFNGLRENDERBUFFERSTORAGEEXTPROC$MH.invokeExact((Addressable)symbol, _target, _internalformat, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


