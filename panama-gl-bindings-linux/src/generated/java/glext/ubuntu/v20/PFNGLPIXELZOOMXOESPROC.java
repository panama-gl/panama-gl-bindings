// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPIXELZOOMXOESPROC {

    void apply(int xfactor, int yfactor);
    static MemorySegment allocate(PFNGLPIXELZOOMXOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPIXELZOOMXOESPROC.class, fi, constants$599.PFNGLPIXELZOOMXOESPROC$FUNC, session);
    }
    static PFNGLPIXELZOOMXOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _xfactor, int _yfactor) -> {
            try {
                constants$600.PFNGLPIXELZOOMXOESPROC$MH.invokeExact((Addressable)symbol, _xfactor, _yfactor);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

