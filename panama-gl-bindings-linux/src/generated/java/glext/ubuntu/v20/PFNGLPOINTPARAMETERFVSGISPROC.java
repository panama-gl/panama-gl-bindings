// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPOINTPARAMETERFVSGISPROC {

    void apply(int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLPOINTPARAMETERFVSGISPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPOINTPARAMETERFVSGISPROC.class, fi, constants$1285.PFNGLPOINTPARAMETERFVSGISPROC$FUNC, session);
    }
    static PFNGLPOINTPARAMETERFVSGISPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$1285.PFNGLPOINTPARAMETERFVSGISPROC$MH.invokeExact((Addressable)symbol, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


