// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBLENDBARRIERKHRPROC {

    void apply();
    static MemorySegment allocate(PFNGLBLENDBARRIERKHRPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBLENDBARRIERKHRPROC.class, fi, constants$491.PFNGLBLENDBARRIERKHRPROC$FUNC, session);
    }
    static PFNGLBLENDBARRIERKHRPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$491.PFNGLBLENDBARRIERKHRPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

