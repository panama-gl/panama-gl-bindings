// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDPROGRAMPIPELINEPROC {

    void apply(int pipeline);
    static MemorySegment allocate(PFNGLBINDPROGRAMPIPELINEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDPROGRAMPIPELINEPROC.class, fi, constants$308.PFNGLBINDPROGRAMPIPELINEPROC$FUNC, session);
    }
    static PFNGLBINDPROGRAMPIPELINEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pipeline) -> {
            try {
                constants$308.PFNGLBINDPROGRAMPIPELINEPROC$MH.invokeExact((Addressable)symbol, _pipeline);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


