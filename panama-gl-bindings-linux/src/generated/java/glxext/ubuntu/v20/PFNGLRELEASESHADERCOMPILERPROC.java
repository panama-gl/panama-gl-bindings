// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLRELEASESHADERCOMPILERPROC {

    void apply();
    static MemorySegment allocate(PFNGLRELEASESHADERCOMPILERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLRELEASESHADERCOMPILERPROC.class, fi, constants$304.PFNGLRELEASESHADERCOMPILERPROC$FUNC, session);
    }
    static PFNGLRELEASESHADERCOMPILERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$304.PFNGLRELEASESHADERCOMPILERPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


