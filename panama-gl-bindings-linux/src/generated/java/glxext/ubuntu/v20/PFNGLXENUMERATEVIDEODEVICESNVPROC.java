// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXENUMERATEVIDEODEVICESNVPROC {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress dpy, int screen, java.lang.foreign.MemoryAddress nelements);
    static MemorySegment allocate(PFNGLXENUMERATEVIDEODEVICESNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXENUMERATEVIDEODEVICESNVPROC.class, fi, constants$1039.PFNGLXENUMERATEVIDEODEVICESNVPROC$FUNC, session);
    }
    static PFNGLXENUMERATEVIDEODEVICESNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, int _screen, java.lang.foreign.MemoryAddress _nelements) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$1039.PFNGLXENUMERATEVIDEODEVICESNVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _screen, (java.lang.foreign.Addressable)_nelements);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


