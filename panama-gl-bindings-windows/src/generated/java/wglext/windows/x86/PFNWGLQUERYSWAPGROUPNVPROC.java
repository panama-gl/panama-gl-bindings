// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLQUERYSWAPGROUPNVPROC {

    int apply(java.lang.foreign.MemoryAddress hDC, java.lang.foreign.MemoryAddress group, java.lang.foreign.MemoryAddress barrier);
    static MemorySegment allocate(PFNWGLQUERYSWAPGROUPNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLQUERYSWAPGROUPNVPROC.class, fi, constants$1400.PFNWGLQUERYSWAPGROUPNVPROC$FUNC, session);
    }
    static PFNWGLQUERYSWAPGROUPNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hDC, java.lang.foreign.MemoryAddress _group, java.lang.foreign.MemoryAddress _barrier) -> {
            try {
                return (int)constants$1400.PFNWGLQUERYSWAPGROUPNVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hDC, (java.lang.foreign.Addressable)_group, (java.lang.foreign.Addressable)_barrier);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


