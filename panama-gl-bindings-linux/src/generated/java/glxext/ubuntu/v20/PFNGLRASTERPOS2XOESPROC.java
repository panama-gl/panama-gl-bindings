// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLRASTERPOS2XOESPROC {

    void apply(int x, int y);
    static MemorySegment allocate(PFNGLRASTERPOS2XOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLRASTERPOS2XOESPROC.class, fi, constants$525.PFNGLRASTERPOS2XOESPROC$FUNC, session);
    }
    static PFNGLRASTERPOS2XOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _x, int _y) -> {
            try {
                constants$525.PFNGLRASTERPOS2XOESPROC$MH.invokeExact((Addressable)symbol, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


