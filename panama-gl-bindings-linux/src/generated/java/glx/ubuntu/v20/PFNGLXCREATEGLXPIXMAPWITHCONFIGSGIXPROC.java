// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC {

    long apply(java.lang.foreign.MemoryAddress dpy, java.lang.foreign.MemoryAddress config, long pixmap);
    static MemorySegment allocate(PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC.class, fi, constants$1049.PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC$FUNC, session);
    }
    static PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, java.lang.foreign.MemoryAddress _config, long _pixmap) -> {
            try {
                return (long)constants$1049.PFNGLXCREATEGLXPIXMAPWITHCONFIGSGIXPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, (java.lang.foreign.Addressable)_config, _pixmap);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


