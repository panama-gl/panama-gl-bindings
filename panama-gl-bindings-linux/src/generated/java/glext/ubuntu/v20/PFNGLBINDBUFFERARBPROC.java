// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDBUFFERARBPROC {

    void apply(int target, int buffer);
    static MemorySegment allocate(PFNGLBINDBUFFERARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERARBPROC.class, fi, constants$525.PFNGLBINDBUFFERARBPROC$FUNC, session);
    }
    static PFNGLBINDBUFFERARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _buffer) -> {
            try {
                constants$525.PFNGLBINDBUFFERARBPROC$MH.invokeExact((Addressable)symbol, _target, _buffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


