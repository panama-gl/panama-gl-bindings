// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXCREATEPIXMAPPROC {

    long apply(java.lang.foreign.MemoryAddress dpy, java.lang.foreign.MemoryAddress config, long pixmap, java.lang.foreign.MemoryAddress attrib_list);
    static MemorySegment allocate(PFNGLXCREATEPIXMAPPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXCREATEPIXMAPPROC.class, fi, constants$1023.PFNGLXCREATEPIXMAPPROC$FUNC, session);
    }
    static PFNGLXCREATEPIXMAPPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, java.lang.foreign.MemoryAddress _config, long _pixmap, java.lang.foreign.MemoryAddress _attrib_list) -> {
            try {
                return (long)constants$1023.PFNGLXCREATEPIXMAPPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, (java.lang.foreign.Addressable)_config, _pixmap, (java.lang.foreign.Addressable)_attrib_list);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


