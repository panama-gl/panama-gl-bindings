// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS2IMESAPROC {

    void apply(int x, int y);
    static MemorySegment allocate(PFNGLWINDOWPOS2IMESAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2IMESAPROC.class, fi, constants$713.PFNGLWINDOWPOS2IMESAPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS2IMESAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _x, int _y) -> {
            try {
                constants$713.PFNGLWINDOWPOS2IMESAPROC$MH.invokeExact((Addressable)symbol, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


