// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLRESETMINMAXEXTPROC {

    void apply(int target);
    static MemorySegment allocate(PFNGLRESETMINMAXEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLRESETMINMAXEXTPROC.class, fi, constants$724.PFNGLRESETMINMAXEXTPROC$FUNC, session);
    }
    static PFNGLRESETMINMAXEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target) -> {
            try {
                constants$724.PFNGLRESETMINMAXEXTPROC$MH.invokeExact((Addressable)symbol, _target);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


