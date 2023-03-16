// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface CS_TYPE_LOCAL_SIZE_ROUTINE {

    void apply(java.lang.foreign.MemoryAddress hBinding, int ulNetworkCodeSet, int ulNetworkBufferSize, java.lang.foreign.MemoryAddress conversionType, java.lang.foreign.MemoryAddress pulLocalBufferSize, java.lang.foreign.MemoryAddress pStatus);
    static MemorySegment allocate(CS_TYPE_LOCAL_SIZE_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(CS_TYPE_LOCAL_SIZE_ROUTINE.class, fi, constants$827.CS_TYPE_LOCAL_SIZE_ROUTINE$FUNC, session);
    }
    static CS_TYPE_LOCAL_SIZE_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hBinding, int _ulNetworkCodeSet, int _ulNetworkBufferSize, java.lang.foreign.MemoryAddress _conversionType, java.lang.foreign.MemoryAddress _pulLocalBufferSize, java.lang.foreign.MemoryAddress _pStatus) -> {
            try {
                constants$827.CS_TYPE_LOCAL_SIZE_ROUTINE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hBinding, _ulNetworkCodeSet, _ulNetworkBufferSize, (java.lang.foreign.Addressable)_conversionType, (java.lang.foreign.Addressable)_pulLocalBufferSize, (java.lang.foreign.Addressable)_pStatus);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


