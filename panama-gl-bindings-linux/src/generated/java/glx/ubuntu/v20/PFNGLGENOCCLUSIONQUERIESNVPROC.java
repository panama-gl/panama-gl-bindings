// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGENOCCLUSIONQUERIESNVPROC {

    void apply(int n, java.lang.foreign.MemoryAddress ids);
    static MemorySegment allocate(PFNGLGENOCCLUSIONQUERIESNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGENOCCLUSIONQUERIESNVPROC.class, fi, constants$868.PFNGLGENOCCLUSIONQUERIESNVPROC$FUNC, session);
    }
    static PFNGLGENOCCLUSIONQUERIESNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _ids) -> {
            try {
                constants$868.PFNGLGENOCCLUSIONQUERIESNVPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_ids);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


