// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PTP_WAIT_CALLBACK {

    void apply(java.lang.foreign.MemoryAddress Instance, java.lang.foreign.MemoryAddress Context, java.lang.foreign.MemoryAddress Wait, int WaitResult);
    static MemorySegment allocate(PTP_WAIT_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PTP_WAIT_CALLBACK.class, fi, constants$125.PTP_WAIT_CALLBACK$FUNC, session);
    }
    static PTP_WAIT_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Instance, java.lang.foreign.MemoryAddress _Context, java.lang.foreign.MemoryAddress _Wait, int _WaitResult) -> {
            try {
                constants$125.PTP_WAIT_CALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Instance, (java.lang.foreign.Addressable)_Context, (java.lang.foreign.Addressable)_Wait, _WaitResult);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


