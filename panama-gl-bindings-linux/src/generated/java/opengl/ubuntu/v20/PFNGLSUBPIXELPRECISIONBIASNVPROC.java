// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSUBPIXELPRECISIONBIASNVPROC {

    void apply(int xbits, int ybits);
    static MemorySegment allocate(PFNGLSUBPIXELPRECISIONBIASNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSUBPIXELPRECISIONBIASNVPROC.class, fi, constants$738.PFNGLSUBPIXELPRECISIONBIASNVPROC$FUNC, session);
    }
    static PFNGLSUBPIXELPRECISIONBIASNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _xbits, int _ybits) -> {
            try {
                constants$738.PFNGLSUBPIXELPRECISIONBIASNVPROC$MH.invokeExact((Addressable)symbol, _xbits, _ybits);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


