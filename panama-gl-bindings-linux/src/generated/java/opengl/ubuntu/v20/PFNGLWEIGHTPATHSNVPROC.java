// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWEIGHTPATHSNVPROC {

    void apply(int resultPath, int numPaths, java.lang.foreign.MemoryAddress paths, java.lang.foreign.MemoryAddress weights);
    static MemorySegment allocate(PFNGLWEIGHTPATHSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWEIGHTPATHSNVPROC.class, fi, constants$789.PFNGLWEIGHTPATHSNVPROC$FUNC, session);
    }
    static PFNGLWEIGHTPATHSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _resultPath, int _numPaths, java.lang.foreign.MemoryAddress _paths, java.lang.foreign.MemoryAddress _weights) -> {
            try {
                constants$789.PFNGLWEIGHTPATHSNVPROC$MH.invokeExact((Addressable)symbol, _resultPath, _numPaths, (java.lang.foreign.Addressable)_paths, (java.lang.foreign.Addressable)_weights);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


