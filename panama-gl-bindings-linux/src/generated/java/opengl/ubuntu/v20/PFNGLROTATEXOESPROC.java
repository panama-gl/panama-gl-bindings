// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLROTATEXOESPROC {

    void apply(int angle, int x, int y, int z);
    static MemorySegment allocate(PFNGLROTATEXOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLROTATEXOESPROC.class, fi, constants$423.PFNGLROTATEXOESPROC$FUNC, session);
    }
    static PFNGLROTATEXOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _angle, int _x, int _y, int _z) -> {
            try {
                constants$423.PFNGLROTATEXOESPROC$MH.invokeExact((Addressable)symbol, _angle, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


