// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISFENCENVPROC {

    byte apply(int fence);
    static MemorySegment allocate(PFNGLISFENCENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISFENCENVPROC.class, fi, constants$833.PFNGLISFENCENVPROC$FUNC, session);
    }
    static PFNGLISFENCENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _fence) -> {
            try {
                return (byte)constants$833.PFNGLISFENCENVPROC$MH.invokeExact((Addressable)symbol, _fence);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


