// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC {

    void apply(int mask);
    static MemorySegment allocate(PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC.class, fi, constants$541.PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC$FUNC, session);
    }
    static PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mask) -> {
            try {
                constants$541.PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC$MH.invokeExact((Addressable)symbol, _mask);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


