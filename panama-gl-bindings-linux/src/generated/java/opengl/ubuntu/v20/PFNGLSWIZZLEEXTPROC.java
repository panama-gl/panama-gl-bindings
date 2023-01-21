// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSWIZZLEEXTPROC {

    void apply(int res, int in, int outX, int outY, int outZ, int outW);
    static MemorySegment allocate(PFNGLSWIZZLEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSWIZZLEEXTPROC.class, fi, constants$684.PFNGLSWIZZLEEXTPROC$FUNC, session);
    }
    static PFNGLSWIZZLEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _res, int _in, int _outX, int _outY, int _outZ, int _outW) -> {
            try {
                constants$684.PFNGLSWIZZLEEXTPROC$MH.invokeExact((Addressable)symbol, _res, _in, _outX, _outY, _outZ, _outW);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


