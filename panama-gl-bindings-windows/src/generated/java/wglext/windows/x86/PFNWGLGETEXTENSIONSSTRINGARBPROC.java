// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLGETEXTENSIONSSTRINGARBPROC {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress hdc);
    static MemorySegment allocate(PFNWGLGETEXTENSIONSSTRINGARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLGETEXTENSIONSSTRINGARBPROC.class, fi, constants$1370.PFNWGLGETEXTENSIONSSTRINGARBPROC$FUNC, session);
    }
    static PFNWGLGETEXTENSIONSSTRINGARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hdc) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$1370.PFNWGLGETEXTENSIONSSTRINGARBPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hdc);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


