// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTANGENT3SEXTPROC {

    void apply(short tx, short ty, short tz);
    static MemorySegment allocate(PFNGLTANGENT3SEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTANGENT3SEXTPROC.class, fi, constants$527.PFNGLTANGENT3SEXTPROC$FUNC, session);
    }
    static PFNGLTANGENT3SEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _tx, short _ty, short _tz) -> {
            try {
                constants$527.PFNGLTANGENT3SEXTPROC$MH.invokeExact((Addressable)symbol, _tx, _ty, _tz);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


