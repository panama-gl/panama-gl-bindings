// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDEPTHRANGEFPROC {

    void apply(float n, float f);
    static MemorySegment allocate(PFNGLDEPTHRANGEFPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDEPTHRANGEFPROC.class, fi, constants$220.PFNGLDEPTHRANGEFPROC$FUNC, session);
    }
    static PFNGLDEPTHRANGEFPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _n, float _f) -> {
            try {
                constants$220.PFNGLDEPTHRANGEFPROC$MH.invokeExact((Addressable)symbol, _n, _f);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


