// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVIDEOCAPTURENVPROC {

    int apply(int video_capture_slot, java.lang.foreign.MemoryAddress sequence_num, java.lang.foreign.MemoryAddress capture_time);
    static MemorySegment allocate(PFNGLVIDEOCAPTURENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVIDEOCAPTURENVPROC.class, fi, constants$1274.PFNGLVIDEOCAPTURENVPROC$FUNC, session);
    }
    static PFNGLVIDEOCAPTURENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _video_capture_slot, java.lang.foreign.MemoryAddress _sequence_num, java.lang.foreign.MemoryAddress _capture_time) -> {
            try {
                return (int)constants$1274.PFNGLVIDEOCAPTURENVPROC$MH.invokeExact((Addressable)symbol, _video_capture_slot, (java.lang.foreign.Addressable)_sequence_num, (java.lang.foreign.Addressable)_capture_time);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


