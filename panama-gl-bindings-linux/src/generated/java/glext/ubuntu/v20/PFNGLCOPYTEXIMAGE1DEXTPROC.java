// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYTEXIMAGE1DEXTPROC {

    void apply(int target, int level, int internalformat, int x, int y, int width, int border);
    static MemorySegment allocate(PFNGLCOPYTEXIMAGE1DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXIMAGE1DEXTPROC.class, fi, constants$531.PFNGLCOPYTEXIMAGE1DEXTPROC$FUNC, session);
    }
    static PFNGLCOPYTEXIMAGE1DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _internalformat, int _x, int _y, int _width, int _border) -> {
            try {
                constants$531.PFNGLCOPYTEXIMAGE1DEXTPROC$MH.invokeExact((Addressable)symbol, _target, _level, _internalformat, _x, _y, _width, _border);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


