// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface ENUMRESTYPEPROCA {

    int apply(java.lang.foreign.MemoryAddress hModule, java.lang.foreign.MemoryAddress lpType, long lParam);
    static MemorySegment allocate(ENUMRESTYPEPROCA fi, MemorySession session) {
        return RuntimeHelper.upcallStub(ENUMRESTYPEPROCA.class, fi, constants$229.ENUMRESTYPEPROCA$FUNC, session);
    }
    static ENUMRESTYPEPROCA ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hModule, java.lang.foreign.MemoryAddress _lpType, long _lParam) -> {
            try {
                return (int)constants$229.ENUMRESTYPEPROCA$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hModule, (java.lang.foreign.Addressable)_lpType, _lParam);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


