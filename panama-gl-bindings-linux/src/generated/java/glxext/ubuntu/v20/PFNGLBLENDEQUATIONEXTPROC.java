// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBLENDEQUATIONEXTPROC {

    void apply(int mode);
    static MemorySegment allocate(PFNGLBLENDEQUATIONEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONEXTPROC.class, fi, constants$603.PFNGLBLENDEQUATIONEXTPROC$FUNC, session);
    }
    static PFNGLBLENDEQUATIONEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode) -> {
            try {
                constants$603.PFNGLBLENDEQUATIONEXTPROC$MH.invokeExact((Addressable)symbol, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


