// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLLOADPROGRAMNVPROC {

    void apply(int target, int id, int len, java.lang.foreign.MemoryAddress program);
    static MemorySegment allocate(PFNGLLOADPROGRAMNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLLOADPROGRAMNVPROC.class, fi, constants$1232.PFNGLLOADPROGRAMNVPROC$FUNC, session);
    }
    static PFNGLLOADPROGRAMNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _id, int _len, java.lang.foreign.MemoryAddress _program) -> {
            try {
                constants$1233.PFNGLLOADPROGRAMNVPROC$MH.invokeExact((Addressable)symbol, _target, _id, _len, (java.lang.foreign.Addressable)_program);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


