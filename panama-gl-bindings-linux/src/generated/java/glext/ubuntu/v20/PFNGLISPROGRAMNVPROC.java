// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISPROGRAMNVPROC {

    byte apply(int id);
    static MemorySegment allocate(PFNGLISPROGRAMNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISPROGRAMNVPROC.class, fi, constants$1232.PFNGLISPROGRAMNVPROC$FUNC, session);
    }
    static PFNGLISPROGRAMNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id) -> {
            try {
                return (byte)constants$1232.PFNGLISPROGRAMNVPROC$MH.invokeExact((Addressable)symbol, _id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

