// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAGMENTCOVERAGECOLORNVPROC {

    void apply(int color);
    static MemorySegment allocate(PFNGLFRAGMENTCOVERAGECOLORNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTCOVERAGECOLORNVPROC.class, fi, constants$749.PFNGLFRAGMENTCOVERAGECOLORNVPROC$FUNC, session);
    }
    static PFNGLFRAGMENTCOVERAGECOLORNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _color) -> {
            try {
                constants$749.PFNGLFRAGMENTCOVERAGECOLORNVPROC$MH.invokeExact((Addressable)symbol, _color);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


