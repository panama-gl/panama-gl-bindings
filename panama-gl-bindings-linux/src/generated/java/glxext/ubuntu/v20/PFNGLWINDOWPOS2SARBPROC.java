// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLWINDOWPOS2SARBPROC {

    void apply(short x, short y);
    static MemorySegment allocate(PFNGLWINDOWPOS2SARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS2SARBPROC.class, fi, constants$487.PFNGLWINDOWPOS2SARBPROC$FUNC, session);
    }
    static PFNGLWINDOWPOS2SARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _x, short _y) -> {
            try {
                constants$487.PFNGLWINDOWPOS2SARBPROC$MH.invokeExact((Addressable)symbol, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


