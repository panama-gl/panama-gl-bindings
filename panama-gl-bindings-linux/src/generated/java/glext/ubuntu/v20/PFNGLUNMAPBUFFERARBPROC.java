// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNMAPBUFFERARBPROC {

    byte apply(int target);
    static MemorySegment allocate(PFNGLUNMAPBUFFERARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNMAPBUFFERARBPROC.class, fi, constants$528.PFNGLUNMAPBUFFERARBPROC$FUNC, session);
    }
    static PFNGLUNMAPBUFFERARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target) -> {
            try {
                return (byte)constants$528.PFNGLUNMAPBUFFERARBPROC$MH.invokeExact((Addressable)symbol, _target);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

