// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNORMAL3HNVPROC {

    void apply(short nx, short ny, short nz);
    static MemorySegment allocate(PFNGLNORMAL3HNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNORMAL3HNVPROC.class, fi, constants$851.PFNGLNORMAL3HNVPROC$FUNC, session);
    }
    static PFNGLNORMAL3HNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _nx, short _ny, short _nz) -> {
            try {
                constants$851.PFNGLNORMAL3HNVPROC$MH.invokeExact((Addressable)symbol, _nx, _ny, _nz);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


