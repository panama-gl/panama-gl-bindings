// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWRECTANGLESEXTPROC {

    void apply(int mode, int count, java.lang.foreign.MemoryAddress box);
    static MemorySegment allocate(PFNGLWINDOWRECTANGLESEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWRECTANGLESEXTPROC.class, fi, constants$783.PFNGLWINDOWRECTANGLESEXTPROC$FUNC, session);
    }
    static PFNGLWINDOWRECTANGLESEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _count, java.lang.foreign.MemoryAddress _box) -> {
            try {
                constants$783.PFNGLWINDOWRECTANGLESEXTPROC$MH.invokeExact((Addressable)symbol, _mode, _count, (java.lang.foreign.Addressable)_box);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


