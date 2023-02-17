// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNORMALSTREAM3BATIPROC {

    void apply(int stream, byte nx, byte ny, byte nz);
    static MemorySegment allocate(PFNGLNORMALSTREAM3BATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNORMALSTREAM3BATIPROC.class, fi, constants$715.PFNGLNORMALSTREAM3BATIPROC$FUNC, session);
    }
    static PFNGLNORMALSTREAM3BATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stream, byte _nx, byte _ny, byte _nz) -> {
            try {
                constants$715.PFNGLNORMALSTREAM3BATIPROC$MH.invokeExact((Addressable)symbol, _stream, _nx, _ny, _nz);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


