// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDISABLEINDEXEDEXTPROC {

    void apply(int target, int index);
    static MemorySegment allocate(PFNGLDISABLEINDEXEDEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDISABLEINDEXEDEXTPROC.class, fi, constants$648.PFNGLDISABLEINDEXEDEXTPROC$FUNC, session);
    }
    static PFNGLDISABLEINDEXEDEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index) -> {
            try {
                constants$648.PFNGLDISABLEINDEXEDEXTPROC$MH.invokeExact((Addressable)symbol, _target, _index);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


