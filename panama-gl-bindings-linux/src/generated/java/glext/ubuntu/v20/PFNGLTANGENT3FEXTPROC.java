// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTANGENT3FEXTPROC {

    void apply(float tx, float ty, float tz);
    static MemorySegment allocate(PFNGLTANGENT3FEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTANGENT3FEXTPROC.class, fi, constants$741.PFNGLTANGENT3FEXTPROC$FUNC, session);
    }
    static PFNGLTANGENT3FEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _tx, float _ty, float _tz) -> {
            try {
                constants$741.PFNGLTANGENT3FEXTPROC$MH.invokeExact((Addressable)symbol, _tx, _ty, _tz);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


