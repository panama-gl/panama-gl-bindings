// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNORMALSTREAM3IATIPROC {

    void apply(int stream, int nx, int ny, int nz);
    static MemorySegment allocate(PFNGLNORMALSTREAM3IATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNORMALSTREAM3IATIPROC.class, fi, constants$598.PFNGLNORMALSTREAM3IATIPROC$FUNC, session);
    }
    static PFNGLNORMALSTREAM3IATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stream, int _nx, int _ny, int _nz) -> {
            try {
                constants$598.PFNGLNORMALSTREAM3IATIPROC$MH.invokeExact((Addressable)symbol, _stream, _nx, _ny, _nz);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


