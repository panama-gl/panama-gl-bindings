// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOVERAGEMODULATIONTABLENVPROC {

    void apply(int n, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLCOVERAGEMODULATIONTABLENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOVERAGEMODULATIONTABLENVPROC.class, fi, constants$1080.PFNGLCOVERAGEMODULATIONTABLENVPROC$FUNC, session);
    }
    static PFNGLCOVERAGEMODULATIONTABLENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$1081.PFNGLCOVERAGEMODULATIONTABLENVPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

