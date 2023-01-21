// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISRENDERBUFFEREXTPROC {

    byte apply(int renderbuffer);
    static MemorySegment allocate(PFNGLISRENDERBUFFEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISRENDERBUFFEREXTPROC.class, fi, constants$710.PFNGLISRENDERBUFFEREXTPROC$FUNC, session);
    }
    static PFNGLISRENDERBUFFEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _renderbuffer) -> {
            try {
                return (byte)constants$710.PFNGLISRENDERBUFFEREXTPROC$MH.invokeExact((Addressable)symbol, _renderbuffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


