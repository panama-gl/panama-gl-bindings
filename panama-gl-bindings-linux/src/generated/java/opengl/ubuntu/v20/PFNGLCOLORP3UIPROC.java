// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOLORP3UIPROC {

    void apply(int type, int color);
    static MemorySegment allocate(PFNGLCOLORP3UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOLORP3UIPROC.class, fi, constants$202.PFNGLCOLORP3UIPROC$FUNC, session);
    }
    static PFNGLCOLORP3UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _color) -> {
            try {
                constants$202.PFNGLCOLORP3UIPROC$MH.invokeExact((Addressable)symbol, _type, _color);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


