// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSTENCILTHENCOVERFILLPATHNVPROC {

    void apply(int path, int fillMode, int mask, int coverMode);
    static MemorySegment allocate(PFNGLSTENCILTHENCOVERFILLPATHNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILTHENCOVERFILLPATHNVPROC.class, fi, constants$802.PFNGLSTENCILTHENCOVERFILLPATHNVPROC$FUNC, session);
    }
    static PFNGLSTENCILTHENCOVERFILLPATHNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path, int _fillMode, int _mask, int _coverMode) -> {
            try {
                constants$802.PFNGLSTENCILTHENCOVERFILLPATHNVPROC$MH.invokeExact((Addressable)symbol, _path, _fillMode, _mask, _coverMode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


