// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTICASTBARRIERNVPROC {

    void apply();
    static MemorySegment allocate(PFNGLMULTICASTBARRIERNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTICASTBARRIERNVPROC.class, fi, constants$841.PFNGLMULTICASTBARRIERNVPROC$FUNC, session);
    }
    static PFNGLMULTICASTBARRIERNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$841.PFNGLMULTICASTBARRIERNVPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


