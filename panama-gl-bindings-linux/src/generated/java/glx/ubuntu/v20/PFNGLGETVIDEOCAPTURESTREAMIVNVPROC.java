// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETVIDEOCAPTURESTREAMIVNVPROC {

    void apply(int video_capture_slot, int stream, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETVIDEOCAPTURESTREAMIVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETVIDEOCAPTURESTREAMIVNVPROC.class, fi, constants$965.PFNGLGETVIDEOCAPTURESTREAMIVNVPROC$FUNC, session);
    }
    static PFNGLGETVIDEOCAPTURESTREAMIVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _video_capture_slot, int _stream, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$965.PFNGLGETVIDEOCAPTURESTREAMIVNVPROC$MH.invokeExact((Addressable)symbol, _video_capture_slot, _stream, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


