// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDPROGRAMARBPROC {

    void apply(int target, int program);
    static MemorySegment allocate(PFNGLBINDPROGRAMARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDPROGRAMARBPROC.class, fi, constants$438.PFNGLBINDPROGRAMARBPROC$FUNC, session);
    }
    static PFNGLBINDPROGRAMARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _program) -> {
            try {
                constants$438.PFNGLBINDPROGRAMARBPROC$MH.invokeExact((Addressable)symbol, _target, _program);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


