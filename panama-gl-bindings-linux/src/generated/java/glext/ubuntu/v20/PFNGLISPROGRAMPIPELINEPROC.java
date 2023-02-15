// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISPROGRAMPIPELINEPROC {

    byte apply(int pipeline);
    static MemorySegment allocate(PFNGLISPROGRAMPIPELINEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISPROGRAMPIPELINEPROC.class, fi, constants$224.PFNGLISPROGRAMPIPELINEPROC$FUNC, session);
    }
    static PFNGLISPROGRAMPIPELINEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pipeline) -> {
            try {
                return (byte)constants$224.PFNGLISPROGRAMPIPELINEPROC$MH.invokeExact((Addressable)symbol, _pipeline);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


