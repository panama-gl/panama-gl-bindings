// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC {

    void apply(java.lang.foreign.MemoryAddress dpy, long device);
    static MemorySegment allocate(PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC.class, fi, constants$1043.PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC$FUNC, session);
    }
    static PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, long _device) -> {
            try {
                constants$1043.PFNGLXRELEASEVIDEOCAPTUREDEVICENVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _device);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


