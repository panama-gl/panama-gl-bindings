// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLGETCONTEXTGPUIDAMDPROC {

    int apply(java.lang.foreign.MemoryAddress hglrc);
    static MemorySegment allocate(PFNWGLGETCONTEXTGPUIDAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLGETCONTEXTGPUIDAMDPROC.class, fi, constants$1375.PFNWGLGETCONTEXTGPUIDAMDPROC$FUNC, session);
    }
    static PFNWGLGETCONTEXTGPUIDAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hglrc) -> {
            try {
                return (int)constants$1375.PFNWGLGETCONTEXTGPUIDAMDPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hglrc);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

