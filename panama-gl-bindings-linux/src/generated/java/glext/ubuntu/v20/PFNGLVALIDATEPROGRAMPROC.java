// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVALIDATEPROGRAMPROC {

    void apply(int program);
    static MemorySegment allocate(PFNGLVALIDATEPROGRAMPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVALIDATEPROGRAMPROC.class, fi, constants$131.PFNGLVALIDATEPROGRAMPROC$FUNC, session);
    }
    static PFNGLVALIDATEPROGRAMPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program) -> {
            try {
                constants$131.PFNGLVALIDATEPROGRAMPROC$MH.invokeExact((Addressable)symbol, _program);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


