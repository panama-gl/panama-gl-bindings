// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSETFENCEAPPLEPROC {

    void apply(int fence);
    static MemorySegment allocate(PFNGLSETFENCEAPPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSETFENCEAPPLEPROC.class, fi, constants$477.PFNGLSETFENCEAPPLEPROC$FUNC, session);
    }
    static PFNGLSETFENCEAPPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _fence) -> {
            try {
                constants$477.PFNGLSETFENCEAPPLEPROC$MH.invokeExact((Addressable)symbol, _fence);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


