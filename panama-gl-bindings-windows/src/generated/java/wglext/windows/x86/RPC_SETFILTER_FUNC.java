// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RPC_SETFILTER_FUNC {

    void apply(java.lang.foreign.MemoryAddress pfnFilter);
    static MemorySegment allocate(RPC_SETFILTER_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RPC_SETFILTER_FUNC.class, fi, constants$687.RPC_SETFILTER_FUNC$FUNC, session);
    }
    static RPC_SETFILTER_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pfnFilter) -> {
            try {
                constants$687.RPC_SETFILTER_FUNC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pfnFilter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


