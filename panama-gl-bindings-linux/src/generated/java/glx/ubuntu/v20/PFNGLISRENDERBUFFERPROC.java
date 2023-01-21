// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISRENDERBUFFERPROC {

    byte apply(int renderbuffer);
    static MemorySegment allocate(PFNGLISRENDERBUFFERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISRENDERBUFFERPROC.class, fi, constants$251.PFNGLISRENDERBUFFERPROC$FUNC, session);
    }
    static PFNGLISRENDERBUFFERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _renderbuffer) -> {
            try {
                return (byte)constants$251.PFNGLISRENDERBUFFERPROC$MH.invokeExact((Addressable)symbol, _renderbuffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


