// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RPC_NEW_HTTP_PROXY_CHANNEL {

    int apply(int RedirectorStage, java.lang.foreign.MemoryAddress ServerName, java.lang.foreign.MemoryAddress ServerPort, java.lang.foreign.MemoryAddress RemoteUser, java.lang.foreign.MemoryAddress AuthType, java.lang.foreign.MemoryAddress ResourceUuid, java.lang.foreign.MemoryAddress SessionId, java.lang.foreign.MemoryAddress Interface, java.lang.foreign.MemoryAddress Reserved, int Flags, java.lang.foreign.MemoryAddress NewServerName, java.lang.foreign.MemoryAddress NewServerPort);
    static MemorySegment allocate(RPC_NEW_HTTP_PROXY_CHANNEL fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RPC_NEW_HTTP_PROXY_CHANNEL.class, fi, constants$662.RPC_NEW_HTTP_PROXY_CHANNEL$FUNC, session);
    }
    static RPC_NEW_HTTP_PROXY_CHANNEL ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _RedirectorStage, java.lang.foreign.MemoryAddress _ServerName, java.lang.foreign.MemoryAddress _ServerPort, java.lang.foreign.MemoryAddress _RemoteUser, java.lang.foreign.MemoryAddress _AuthType, java.lang.foreign.MemoryAddress _ResourceUuid, java.lang.foreign.MemoryAddress _SessionId, java.lang.foreign.MemoryAddress _Interface, java.lang.foreign.MemoryAddress _Reserved, int _Flags, java.lang.foreign.MemoryAddress _NewServerName, java.lang.foreign.MemoryAddress _NewServerPort) -> {
            try {
                return (int)constants$662.RPC_NEW_HTTP_PROXY_CHANNEL$MH.invokeExact((Addressable)symbol, _RedirectorStage, (java.lang.foreign.Addressable)_ServerName, (java.lang.foreign.Addressable)_ServerPort, (java.lang.foreign.Addressable)_RemoteUser, (java.lang.foreign.Addressable)_AuthType, (java.lang.foreign.Addressable)_ResourceUuid, (java.lang.foreign.Addressable)_SessionId, (java.lang.foreign.Addressable)_Interface, (java.lang.foreign.Addressable)_Reserved, _Flags, (java.lang.foreign.Addressable)_NewServerName, (java.lang.foreign.Addressable)_NewServerPort);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

