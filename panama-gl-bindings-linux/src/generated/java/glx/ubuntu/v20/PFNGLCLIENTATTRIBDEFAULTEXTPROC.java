// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCLIENTATTRIBDEFAULTEXTPROC {

    void apply(int mask);
    static MemorySegment allocate(PFNGLCLIENTATTRIBDEFAULTEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCLIENTATTRIBDEFAULTEXTPROC.class, fi, constants$626.PFNGLCLIENTATTRIBDEFAULTEXTPROC$FUNC, session);
    }
    static PFNGLCLIENTATTRIBDEFAULTEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mask) -> {
            try {
                constants$626.PFNGLCLIENTATTRIBDEFAULTEXTPROC$MH.invokeExact((Addressable)symbol, _mask);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

