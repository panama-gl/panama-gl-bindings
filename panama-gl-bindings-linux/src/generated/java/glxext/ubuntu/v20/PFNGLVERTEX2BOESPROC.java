// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEX2BOESPROC {

    void apply(byte x, byte y);
    static MemorySegment allocate(PFNGLVERTEX2BOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEX2BOESPROC.class, fi, constants$497.PFNGLVERTEX2BOESPROC$FUNC, session);
    }
    static PFNGLVERTEX2BOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _x, byte _y) -> {
            try {
                constants$497.PFNGLVERTEX2BOESPROC$MH.invokeExact((Addressable)symbol, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


