// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBEGINVIDEOCAPTURENVPROC {

    void apply(int video_capture_slot);
    static MemorySegment allocate(PFNGLBEGINVIDEOCAPTURENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBEGINVIDEOCAPTURENVPROC.class, fi, constants$964.PFNGLBEGINVIDEOCAPTURENVPROC$FUNC, session);
    }
    static PFNGLBEGINVIDEOCAPTURENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _video_capture_slot) -> {
            try {
                constants$964.PFNGLBEGINVIDEOCAPTURENVPROC$MH.invokeExact((Addressable)symbol, _video_capture_slot);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


