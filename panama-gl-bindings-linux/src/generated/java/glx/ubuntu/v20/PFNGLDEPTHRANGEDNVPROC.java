// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDEPTHRANGEDNVPROC {

    void apply(double zNear, double zFar);
    static MemorySegment allocate(PFNGLDEPTHRANGEDNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDEPTHRANGEDNVPROC.class, fi, constants$825.PFNGLDEPTHRANGEDNVPROC$FUNC, session);
    }
    static PFNGLDEPTHRANGEDNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (double _zNear, double _zFar) -> {
            try {
                constants$825.PFNGLDEPTHRANGEDNVPROC$MH.invokeExact((Addressable)symbol, _zNear, _zFar);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

