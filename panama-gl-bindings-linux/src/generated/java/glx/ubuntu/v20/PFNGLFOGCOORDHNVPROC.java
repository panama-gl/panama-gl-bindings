// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFOGCOORDHNVPROC {

    void apply(short fog);
    static MemorySegment allocate(PFNGLFOGCOORDHNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDHNVPROC.class, fi, constants$858.PFNGLFOGCOORDHNVPROC$FUNC, session);
    }
    static PFNGLFOGCOORDHNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _fog) -> {
            try {
                constants$858.PFNGLFOGCOORDHNVPROC$MH.invokeExact((Addressable)symbol, _fog);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


