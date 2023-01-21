// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNORMALSTREAM3DATIPROC {

    void apply(int stream, double nx, double ny, double nz);
    static MemorySegment allocate(PFNGLNORMALSTREAM3DATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNORMALSTREAM3DATIPROC.class, fi, constants$514.PFNGLNORMALSTREAM3DATIPROC$FUNC, session);
    }
    static PFNGLNORMALSTREAM3DATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stream, double _nx, double _ny, double _nz) -> {
            try {
                constants$514.PFNGLNORMALSTREAM3DATIPROC$MH.invokeExact((Addressable)symbol, _stream, _nx, _ny, _nz);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


