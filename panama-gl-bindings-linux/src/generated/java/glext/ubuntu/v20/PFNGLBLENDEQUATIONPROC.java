// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBLENDEQUATIONPROC {

    void apply(int mode);
    static MemorySegment allocate(PFNGLBLENDEQUATIONPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONPROC.class, fi, constants$106.PFNGLBLENDEQUATIONPROC$FUNC, session);
    }
    static PFNGLBLENDEQUATIONPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode) -> {
            try {
                constants$106.PFNGLBLENDEQUATIONPROC$MH.invokeExact((Addressable)symbol, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

