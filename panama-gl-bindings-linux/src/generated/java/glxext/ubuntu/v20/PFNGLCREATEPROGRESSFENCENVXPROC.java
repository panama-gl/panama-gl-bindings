// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCREATEPROGRESSFENCENVXPROC {

    int apply();
    static MemorySegment allocate(PFNGLCREATEPROGRESSFENCENVXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCREATEPROGRESSFENCENVXPROC.class, fi, constants$809.PFNGLCREATEPROGRESSFENCENVXPROC$FUNC, session);
    }
    static PFNGLCREATEPROGRESSFENCENVXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                return (int)constants$809.PFNGLCREATEPROGRESSFENCENVXPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


