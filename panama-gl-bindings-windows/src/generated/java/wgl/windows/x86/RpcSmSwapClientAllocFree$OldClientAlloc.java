// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RpcSmSwapClientAllocFree$OldClientAlloc {

    java.lang.foreign.Addressable apply(long _x0);
    static MemorySegment allocate(RpcSmSwapClientAllocFree$OldClientAlloc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RpcSmSwapClientAllocFree$OldClientAlloc.class, fi, constants$860.RpcSmSwapClientAllocFree$OldClientAlloc$FUNC, session);
    }
    static RpcSmSwapClientAllocFree$OldClientAlloc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long __x0) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$860.RpcSmSwapClientAllocFree$OldClientAlloc$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


