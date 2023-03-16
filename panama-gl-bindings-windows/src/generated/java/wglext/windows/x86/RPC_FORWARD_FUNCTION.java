// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RPC_FORWARD_FUNCTION {

    int apply(java.lang.foreign.MemoryAddress InterfaceId, java.lang.foreign.MemoryAddress InterfaceVersion, java.lang.foreign.MemoryAddress ObjectId, java.lang.foreign.MemoryAddress Rpcpro, java.lang.foreign.MemoryAddress ppDestEndpoint);
    static MemorySegment allocate(RPC_FORWARD_FUNCTION fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RPC_FORWARD_FUNCTION.class, fi, constants$674.RPC_FORWARD_FUNCTION$FUNC, session);
    }
    static RPC_FORWARD_FUNCTION ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _InterfaceId, java.lang.foreign.MemoryAddress _InterfaceVersion, java.lang.foreign.MemoryAddress _ObjectId, java.lang.foreign.MemoryAddress _Rpcpro, java.lang.foreign.MemoryAddress _ppDestEndpoint) -> {
            try {
                return (int)constants$674.RPC_FORWARD_FUNCTION$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_InterfaceId, (java.lang.foreign.Addressable)_InterfaceVersion, (java.lang.foreign.Addressable)_ObjectId, (java.lang.foreign.Addressable)_Rpcpro, (java.lang.foreign.Addressable)_ppDestEndpoint);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


