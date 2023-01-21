// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISSTATENVPROC {

    byte apply(int state);
    static MemorySegment allocate(PFNGLISSTATENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISSTATENVPROC.class, fi, constants$732.PFNGLISSTATENVPROC$FUNC, session);
    }
    static PFNGLISSTATENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _state) -> {
            try {
                return (byte)constants$732.PFNGLISSTATENVPROC$MH.invokeExact((Addressable)symbol, _state);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


