// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVALIDATEPROGRAMARBPROC {

    void apply(int programObj);
    static MemorySegment allocate(PFNGLVALIDATEPROGRAMARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVALIDATEPROGRAMARBPROC.class, fi, constants$493.PFNGLVALIDATEPROGRAMARBPROC$FUNC, session);
    }
    static PFNGLVALIDATEPROGRAMARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _programObj) -> {
            try {
                constants$493.PFNGLVALIDATEPROGRAMARBPROC$MH.invokeExact((Addressable)symbol, _programObj);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


