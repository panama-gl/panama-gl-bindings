// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISPATHNVPROC {

    byte apply(int path);
    static MemorySegment allocate(PFNGLISPATHNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISPATHNVPROC.class, fi, constants$872.PFNGLISPATHNVPROC$FUNC, session);
    }
    static PFNGLISPATHNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path) -> {
            try {
                return (byte)constants$872.PFNGLISPATHNVPROC$MH.invokeExact((Addressable)symbol, _path);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

