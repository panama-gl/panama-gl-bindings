// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPATHSTENCILFUNCNVPROC {

    void apply(int func, int ref, int mask);
    static MemorySegment allocate(PFNGLPATHSTENCILFUNCNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPATHSTENCILFUNCNVPROC.class, fi, constants$878.PFNGLPATHSTENCILFUNCNVPROC$FUNC, session);
    }
    static PFNGLPATHSTENCILFUNCNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _func, int _ref, int _mask) -> {
            try {
                constants$878.PFNGLPATHSTENCILFUNCNVPROC$MH.invokeExact((Addressable)symbol, _func, _ref, _mask);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


