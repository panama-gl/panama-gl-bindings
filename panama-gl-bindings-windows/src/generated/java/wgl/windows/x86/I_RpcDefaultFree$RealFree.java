// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface I_RpcDefaultFree$RealFree {

    void apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(I_RpcDefaultFree$RealFree fi, MemorySession session) {
        return RuntimeHelper.upcallStub(I_RpcDefaultFree$RealFree.class, fi, constants$821.I_RpcDefaultFree$RealFree$FUNC, session);
    }
    static I_RpcDefaultFree$RealFree ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                constants$821.I_RpcDefaultFree$RealFree$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


