// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFOGCOORDDPROC {

    void apply(double coord);
    static MemorySegment allocate(PFNGLFOGCOORDDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDDPROC.class, fi, constants$94.PFNGLFOGCOORDDPROC$FUNC, session);
    }
    static PFNGLFOGCOORDDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (double _coord) -> {
            try {
                constants$94.PFNGLFOGCOORDDPROC$MH.invokeExact((Addressable)symbol, _coord);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


