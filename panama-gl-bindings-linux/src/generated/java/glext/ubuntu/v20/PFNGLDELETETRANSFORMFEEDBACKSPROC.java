// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDELETETRANSFORMFEEDBACKSPROC {

    void apply(int n, java.lang.foreign.MemoryAddress ids);
    static MemorySegment allocate(PFNGLDELETETRANSFORMFEEDBACKSPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDELETETRANSFORMFEEDBACKSPROC.class, fi, constants$272.PFNGLDELETETRANSFORMFEEDBACKSPROC$FUNC, session);
    }
    static PFNGLDELETETRANSFORMFEEDBACKSPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _ids) -> {
            try {
                constants$272.PFNGLDELETETRANSFORMFEEDBACKSPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_ids);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

