// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXBINDTEXIMAGEEXTPROC {

    void apply(java.lang.foreign.MemoryAddress dpy, long drawable, int buffer, java.lang.foreign.MemoryAddress attrib_list);
    static MemorySegment allocate(PFNGLXBINDTEXIMAGEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXBINDTEXIMAGEEXTPROC.class, fi, constants$1033.PFNGLXBINDTEXIMAGEEXTPROC$FUNC, session);
    }
    static PFNGLXBINDTEXIMAGEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, long _drawable, int _buffer, java.lang.foreign.MemoryAddress _attrib_list) -> {
            try {
                constants$1034.PFNGLXBINDTEXIMAGEEXTPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _drawable, _buffer, (java.lang.foreign.Addressable)_attrib_list);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

