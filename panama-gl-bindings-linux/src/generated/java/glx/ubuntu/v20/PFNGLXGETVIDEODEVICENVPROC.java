// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXGETVIDEODEVICENVPROC {

    int apply(java.lang.foreign.MemoryAddress dpy, int screen, int numVideoDevices, java.lang.foreign.MemoryAddress pVideoDevice);
    static MemorySegment allocate(PFNGLXGETVIDEODEVICENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXGETVIDEODEVICENVPROC.class, fi, constants$1043.PFNGLXGETVIDEODEVICENVPROC$FUNC, session);
    }
    static PFNGLXGETVIDEODEVICENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, int _screen, int _numVideoDevices, java.lang.foreign.MemoryAddress _pVideoDevice) -> {
            try {
                return (int)constants$1044.PFNGLXGETVIDEODEVICENVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _screen, _numVideoDevices, (java.lang.foreign.Addressable)_pVideoDevice);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

