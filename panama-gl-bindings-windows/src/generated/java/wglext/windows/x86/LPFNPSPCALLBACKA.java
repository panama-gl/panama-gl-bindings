// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPFNPSPCALLBACKA {

    int apply(java.lang.foreign.MemoryAddress hwnd, int uMsg, java.lang.foreign.MemoryAddress ppsp);
    static MemorySegment allocate(LPFNPSPCALLBACKA fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPFNPSPCALLBACKA.class, fi, constants$889.LPFNPSPCALLBACKA$FUNC, session);
    }
    static LPFNPSPCALLBACKA ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hwnd, int _uMsg, java.lang.foreign.MemoryAddress _ppsp) -> {
            try {
                return (int)constants$889.LPFNPSPCALLBACKA$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hwnd, _uMsg, (java.lang.foreign.Addressable)_ppsp);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


