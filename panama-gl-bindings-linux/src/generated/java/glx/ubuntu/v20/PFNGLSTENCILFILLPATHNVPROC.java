// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSTENCILFILLPATHNVPROC {

    void apply(int path, int fillMode, int mask);
    static MemorySegment allocate(PFNGLSTENCILFILLPATHNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILFILLPATHNVPROC.class, fi, constants$878.PFNGLSTENCILFILLPATHNVPROC$FUNC, session);
    }
    static PFNGLSTENCILFILLPATHNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path, int _fillMode, int _mask) -> {
            try {
                constants$878.PFNGLSTENCILFILLPATHNVPROC$MH.invokeExact((Addressable)symbol, _path, _fillMode, _mask);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

