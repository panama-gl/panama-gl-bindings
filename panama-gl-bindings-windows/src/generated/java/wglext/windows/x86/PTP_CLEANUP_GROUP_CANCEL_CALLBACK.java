// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PTP_CLEANUP_GROUP_CANCEL_CALLBACK {

    void apply(java.lang.foreign.MemoryAddress ObjectContext, java.lang.foreign.MemoryAddress CleanupContext);
    static MemorySegment allocate(PTP_CLEANUP_GROUP_CANCEL_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PTP_CLEANUP_GROUP_CANCEL_CALLBACK.class, fi, constants$122.PTP_CLEANUP_GROUP_CANCEL_CALLBACK$FUNC, session);
    }
    static PTP_CLEANUP_GROUP_CANCEL_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _ObjectContext, java.lang.foreign.MemoryAddress _CleanupContext) -> {
            try {
                constants$122.PTP_CLEANUP_GROUP_CANCEL_CALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_ObjectContext, (java.lang.foreign.Addressable)_CleanupContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


