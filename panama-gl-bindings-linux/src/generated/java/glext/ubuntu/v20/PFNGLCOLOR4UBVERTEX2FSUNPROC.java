// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOLOR4UBVERTEX2FSUNPROC {

    void apply(byte r, byte g, byte b, byte a, float x, float y);
    static MemorySegment allocate(PFNGLCOLOR4UBVERTEX2FSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR4UBVERTEX2FSUNPROC.class, fi, constants$1326.PFNGLCOLOR4UBVERTEX2FSUNPROC$FUNC, session);
    }
    static PFNGLCOLOR4UBVERTEX2FSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _r, byte _g, byte _b, byte _a, float _x, float _y) -> {
            try {
                constants$1326.PFNGLCOLOR4UBVERTEX2FSUNPROC$MH.invokeExact((Addressable)symbol, _r, _g, _b, _a, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


