// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPHANDLER_FUNCTION_EX {

    int apply(int dwControl, int dwEventType, java.lang.foreign.MemoryAddress lpEventData, java.lang.foreign.MemoryAddress lpContext);
    static MemorySegment allocate(LPHANDLER_FUNCTION_EX fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPHANDLER_FUNCTION_EX.class, fi, constants$1270.LPHANDLER_FUNCTION_EX$FUNC, session);
    }
    static LPHANDLER_FUNCTION_EX ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dwControl, int _dwEventType, java.lang.foreign.MemoryAddress _lpEventData, java.lang.foreign.MemoryAddress _lpContext) -> {
            try {
                return (int)constants$1270.LPHANDLER_FUNCTION_EX$MH.invokeExact((Addressable)symbol, _dwControl, _dwEventType, (java.lang.foreign.Addressable)_lpEventData, (java.lang.foreign.Addressable)_lpContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


