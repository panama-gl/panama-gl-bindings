// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEX2HNVPROC {

    void apply(short x, short y);
    static MemorySegment allocate(PFNGLVERTEX2HNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEX2HNVPROC.class, fi, constants$849.PFNGLVERTEX2HNVPROC$FUNC, session);
    }
    static PFNGLVERTEX2HNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _x, short _y) -> {
            try {
                constants$849.PFNGLVERTEX2HNVPROC$MH.invokeExact((Addressable)symbol, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

