// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLLINEWIDTHXOESPROC {

    void apply(int width);
    static MemorySegment allocate(PFNGLLINEWIDTHXOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLLINEWIDTHXOESPROC.class, fi, constants$419.PFNGLLINEWIDTHXOESPROC$FUNC, session);
    }
    static PFNGLLINEWIDTHXOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _width) -> {
            try {
                constants$419.PFNGLLINEWIDTHXOESPROC$MH.invokeExact((Addressable)symbol, _width);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


