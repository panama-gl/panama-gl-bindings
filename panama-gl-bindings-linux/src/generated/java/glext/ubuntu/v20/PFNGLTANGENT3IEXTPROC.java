// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTANGENT3IEXTPROC {

    void apply(int tx, int ty, int tz);
    static MemorySegment allocate(PFNGLTANGENT3IEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTANGENT3IEXTPROC.class, fi, constants$526.PFNGLTANGENT3IEXTPROC$FUNC, session);
    }
    static PFNGLTANGENT3IEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _tx, int _ty, int _tz) -> {
            try {
                constants$526.PFNGLTANGENT3IEXTPROC$MH.invokeExact((Addressable)symbol, _tx, _ty, _tz);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


