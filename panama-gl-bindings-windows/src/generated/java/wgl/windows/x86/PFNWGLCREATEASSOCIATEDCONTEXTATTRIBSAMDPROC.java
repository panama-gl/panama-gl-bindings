// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLCREATEASSOCIATEDCONTEXTATTRIBSAMDPROC {

    java.lang.foreign.Addressable apply(int id, java.lang.foreign.MemoryAddress hShareContext, java.lang.foreign.MemoryAddress attribList);
    static MemorySegment allocate(PFNWGLCREATEASSOCIATEDCONTEXTATTRIBSAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLCREATEASSOCIATEDCONTEXTATTRIBSAMDPROC.class, fi, constants$1385.PFNWGLCREATEASSOCIATEDCONTEXTATTRIBSAMDPROC$FUNC, session);
    }
    static PFNWGLCREATEASSOCIATEDCONTEXTATTRIBSAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, java.lang.foreign.MemoryAddress _hShareContext, java.lang.foreign.MemoryAddress _attribList) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$1385.PFNWGLCREATEASSOCIATEDCONTEXTATTRIBSAMDPROC$MH.invokeExact((Addressable)symbol, _id, (java.lang.foreign.Addressable)_hShareContext, (java.lang.foreign.Addressable)_attribList);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


