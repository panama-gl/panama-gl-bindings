// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RpcServerRegisterIf3$IfCallback {

    int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
    static MemorySegment allocate(RpcServerRegisterIf3$IfCallback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RpcServerRegisterIf3$IfCallback.class, fi, constants$655.RpcServerRegisterIf3$IfCallback$FUNC, session);
    }
    static RpcServerRegisterIf3$IfCallback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
            try {
                return (int)constants$655.RpcServerRegisterIf3$IfCallback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


