// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDELETEPROGRAMPIPELINESPROC {

    void apply(int n, java.lang.foreign.MemoryAddress pipelines);
    static MemorySegment allocate(PFNGLDELETEPROGRAMPIPELINESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDELETEPROGRAMPIPELINESPROC.class, fi, constants$308.PFNGLDELETEPROGRAMPIPELINESPROC$FUNC, session);
    }
    static PFNGLDELETEPROGRAMPIPELINESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _pipelines) -> {
            try {
                constants$308.PFNGLDELETEPROGRAMPIPELINESPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_pipelines);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


