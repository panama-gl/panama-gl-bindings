// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINTERPOLATEPATHSNVPROC {

    void apply(int resultPath, int pathA, int pathB, float weight);
    static MemorySegment allocate(PFNGLINTERPOLATEPATHSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINTERPOLATEPATHSNVPROC.class, fi, constants$875.PFNGLINTERPOLATEPATHSNVPROC$FUNC, session);
    }
    static PFNGLINTERPOLATEPATHSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _resultPath, int _pathA, int _pathB, float _weight) -> {
            try {
                constants$875.PFNGLINTERPOLATEPATHSNVPROC$MH.invokeExact((Addressable)symbol, _resultPath, _pathA, _pathB, _weight);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


