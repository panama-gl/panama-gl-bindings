// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PQUERYACTCTXW_FUNC {

    int apply(int dwFlags, java.lang.foreign.MemoryAddress hActCtx, java.lang.foreign.MemoryAddress pvSubInstance, int ulInfoClass, java.lang.foreign.MemoryAddress pvBuffer, long cbBuffer, java.lang.foreign.MemoryAddress pcbWrittenOrRequired);
    static MemorySegment allocate(PQUERYACTCTXW_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PQUERYACTCTXW_FUNC.class, fi, constants$336.PQUERYACTCTXW_FUNC$FUNC, session);
    }
    static PQUERYACTCTXW_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dwFlags, java.lang.foreign.MemoryAddress _hActCtx, java.lang.foreign.MemoryAddress _pvSubInstance, int _ulInfoClass, java.lang.foreign.MemoryAddress _pvBuffer, long _cbBuffer, java.lang.foreign.MemoryAddress _pcbWrittenOrRequired) -> {
            try {
                return (int)constants$337.PQUERYACTCTXW_FUNC$MH.invokeExact((Addressable)symbol, _dwFlags, (java.lang.foreign.Addressable)_hActCtx, (java.lang.foreign.Addressable)_pvSubInstance, _ulInfoClass, (java.lang.foreign.Addressable)_pvBuffer, _cbBuffer, (java.lang.foreign.Addressable)_pcbWrittenOrRequired);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


