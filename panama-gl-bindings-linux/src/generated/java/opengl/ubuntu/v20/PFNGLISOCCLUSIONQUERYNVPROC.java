// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISOCCLUSIONQUERYNVPROC {

    byte apply(int id);
    static MemorySegment allocate(PFNGLISOCCLUSIONQUERYNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISOCCLUSIONQUERYNVPROC.class, fi, constants$783.PFNGLISOCCLUSIONQUERYNVPROC$FUNC, session);
    }
    static PFNGLISOCCLUSIONQUERYNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id) -> {
            try {
                return (byte)constants$783.PFNGLISOCCLUSIONQUERYNVPROC$MH.invokeExact((Addressable)symbol, _id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


