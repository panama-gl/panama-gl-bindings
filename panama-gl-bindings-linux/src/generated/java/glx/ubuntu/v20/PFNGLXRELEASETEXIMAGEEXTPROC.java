// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXRELEASETEXIMAGEEXTPROC {

    void apply(java.lang.foreign.MemoryAddress dpy, long drawable, int buffer);
    static MemorySegment allocate(PFNGLXRELEASETEXIMAGEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXRELEASETEXIMAGEEXTPROC.class, fi, constants$1034.PFNGLXRELEASETEXIMAGEEXTPROC$FUNC, session);
    }
    static PFNGLXRELEASETEXIMAGEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, long _drawable, int _buffer) -> {
            try {
                constants$1034.PFNGLXRELEASETEXIMAGEEXTPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _drawable, _buffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


