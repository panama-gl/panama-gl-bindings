// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDELETESTATESNVPROC {

    void apply(int n, java.lang.foreign.MemoryAddress states);
    static MemorySegment allocate(PFNGLDELETESTATESNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDELETESTATESNVPROC.class, fi, constants$817.PFNGLDELETESTATESNVPROC$FUNC, session);
    }
    static PFNGLDELETESTATESNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _states) -> {
            try {
                constants$817.PFNGLDELETESTATESNVPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_states);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

