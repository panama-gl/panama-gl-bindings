// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLDXLOCKOBJECTSNVPROC {

    int apply(java.lang.foreign.MemoryAddress hDevice, int count, java.lang.foreign.MemoryAddress hObjects);
    static MemorySegment allocate(PFNWGLDXLOCKOBJECTSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLDXLOCKOBJECTSNVPROC.class, fi, constants$1404.PFNWGLDXLOCKOBJECTSNVPROC$FUNC, session);
    }
    static PFNWGLDXLOCKOBJECTSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hDevice, int _count, java.lang.foreign.MemoryAddress _hObjects) -> {
            try {
                return (int)constants$1404.PFNWGLDXLOCKOBJECTSNVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hDevice, _count, (java.lang.foreign.Addressable)_hObjects);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

