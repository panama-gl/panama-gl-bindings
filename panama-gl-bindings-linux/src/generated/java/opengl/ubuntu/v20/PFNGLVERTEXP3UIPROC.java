// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXP3UIPROC {

    void apply(int type, int value);
    static MemorySegment allocate(PFNGLVERTEXP3UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXP3UIPROC.class, fi, constants$194.PFNGLVERTEXP3UIPROC$FUNC, session);
    }
    static PFNGLVERTEXP3UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _value) -> {
            try {
                constants$194.PFNGLVERTEXP3UIPROC$MH.invokeExact((Addressable)symbol, _type, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


