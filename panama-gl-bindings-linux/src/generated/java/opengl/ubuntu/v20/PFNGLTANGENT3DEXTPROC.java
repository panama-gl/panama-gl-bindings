// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTANGENT3DEXTPROC {

    void apply(double tx, double ty, double tz);
    static MemorySegment allocate(PFNGLTANGENT3DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTANGENT3DEXTPROC.class, fi, constants$525.PFNGLTANGENT3DEXTPROC$FUNC, session);
    }
    static PFNGLTANGENT3DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (double _tx, double _ty, double _tz) -> {
            try {
                constants$525.PFNGLTANGENT3DEXTPROC$MH.invokeExact((Addressable)symbol, _tx, _ty, _tz);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


