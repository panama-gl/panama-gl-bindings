// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLDXUNREGISTEROBJECTNVPROC {

    int apply(java.lang.foreign.MemoryAddress hDevice, java.lang.foreign.MemoryAddress hObject);
    static MemorySegment allocate(PFNWGLDXUNREGISTEROBJECTNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLDXUNREGISTEROBJECTNVPROC.class, fi, constants$1403.PFNWGLDXUNREGISTEROBJECTNVPROC$FUNC, session);
    }
    static PFNWGLDXUNREGISTEROBJECTNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hDevice, java.lang.foreign.MemoryAddress _hObject) -> {
            try {
                return (int)constants$1403.PFNWGLDXUNREGISTEROBJECTNVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hDevice, (java.lang.foreign.Addressable)_hObject);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

