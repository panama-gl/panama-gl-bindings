// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBUFFERATTACHMEMORYNVPROC {

    void apply(int target, int memory, long offset);
    static MemorySegment allocate(PFNGLBUFFERATTACHMEMORYNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERATTACHMEMORYNVPROC.class, fi, constants$866.PFNGLBUFFERATTACHMEMORYNVPROC$FUNC, session);
    }
    static PFNGLBUFFERATTACHMEMORYNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _memory, long _offset) -> {
            try {
                constants$866.PFNGLBUFFERATTACHMEMORYNVPROC$MH.invokeExact((Addressable)symbol, _target, _memory, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

