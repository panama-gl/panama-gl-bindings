// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface SC_NOTIFICATION_CALLBACK {

    void apply(int dwNotify, java.lang.foreign.MemoryAddress pCallbackContext);
    static MemorySegment allocate(SC_NOTIFICATION_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(SC_NOTIFICATION_CALLBACK.class, fi, constants$1279.SC_NOTIFICATION_CALLBACK$FUNC, session);
    }
    static SC_NOTIFICATION_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dwNotify, java.lang.foreign.MemoryAddress _pCallbackContext) -> {
            try {
                constants$1279.SC_NOTIFICATION_CALLBACK$MH.invokeExact((Addressable)symbol, _dwNotify, (java.lang.foreign.Addressable)_pCallbackContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

