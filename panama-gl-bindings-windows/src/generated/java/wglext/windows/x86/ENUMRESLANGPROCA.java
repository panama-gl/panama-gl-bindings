// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface ENUMRESLANGPROCA {

    int apply(java.lang.foreign.MemoryAddress hModule, java.lang.foreign.MemoryAddress lpType, java.lang.foreign.MemoryAddress lpName, short wLanguage, long lParam);
    static MemorySegment allocate(ENUMRESLANGPROCA fi, MemorySession session) {
        return RuntimeHelper.upcallStub(ENUMRESLANGPROCA.class, fi, constants$222.ENUMRESLANGPROCA$FUNC, session);
    }
    static ENUMRESLANGPROCA ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hModule, java.lang.foreign.MemoryAddress _lpType, java.lang.foreign.MemoryAddress _lpName, short _wLanguage, long _lParam) -> {
            try {
                return (int)constants$222.ENUMRESLANGPROCA$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hModule, (java.lang.foreign.Addressable)_lpType, (java.lang.foreign.Addressable)_lpName, _wLanguage, _lParam);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

