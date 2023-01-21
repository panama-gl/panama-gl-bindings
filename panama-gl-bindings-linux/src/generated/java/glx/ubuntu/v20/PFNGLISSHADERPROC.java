// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISSHADERPROC {

    byte apply(int shader);
    static MemorySegment allocate(PFNGLISSHADERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISSHADERPROC.class, fi, constants$209.PFNGLISSHADERPROC$FUNC, session);
    }
    static PFNGLISSHADERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _shader) -> {
            try {
                return (byte)constants$209.PFNGLISSHADERPROC$MH.invokeExact((Addressable)symbol, _shader);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

