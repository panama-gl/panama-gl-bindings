// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEX3BOESPROC {

    void apply(byte x, byte y, byte z);
    static MemorySegment allocate(PFNGLVERTEX3BOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEX3BOESPROC.class, fi, constants$497.PFNGLVERTEX3BOESPROC$FUNC, session);
    }
    static PFNGLVERTEX3BOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _x, byte _y, byte _z) -> {
            try {
                constants$497.PFNGLVERTEX3BOESPROC$MH.invokeExact((Addressable)symbol, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

