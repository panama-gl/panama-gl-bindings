// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC {

    void apply(int mode);
    static MemorySegment allocate(PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC.class, fi, constants$810.PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC$FUNC, session);
    }
    static PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode) -> {
            try {
                constants$810.PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC$MH.invokeExact((Addressable)symbol, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


