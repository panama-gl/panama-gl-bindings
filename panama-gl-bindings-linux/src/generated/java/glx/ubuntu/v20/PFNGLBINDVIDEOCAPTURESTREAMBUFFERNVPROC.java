// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC {

    void apply(int video_capture_slot, int stream, int frame_region, long offset);
    static MemorySegment allocate(PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC.class, fi, constants$964.PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC$FUNC, session);
    }
    static PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _video_capture_slot, int _stream, int _frame_region, long _offset) -> {
            try {
                constants$964.PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC$MH.invokeExact((Addressable)symbol, _video_capture_slot, _stream, _frame_region, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


