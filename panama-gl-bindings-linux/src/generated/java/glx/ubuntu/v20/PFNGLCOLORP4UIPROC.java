// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOLORP4UIPROC {

    void apply(int type, int color);
    static MemorySegment allocate(PFNGLCOLORP4UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOLORP4UIPROC.class, fi, constants$288.PFNGLCOLORP4UIPROC$FUNC, session);
    }
    static PFNGLCOLORP4UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _color) -> {
            try {
                constants$288.PFNGLCOLORP4UIPROC$MH.invokeExact((Addressable)symbol, _type, _color);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

