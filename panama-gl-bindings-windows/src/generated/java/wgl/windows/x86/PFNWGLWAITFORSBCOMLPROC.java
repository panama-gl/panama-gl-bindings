// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLWAITFORSBCOMLPROC {

    int apply(java.lang.foreign.MemoryAddress hdc, long target_sbc, java.lang.foreign.MemoryAddress ust, java.lang.foreign.MemoryAddress msc, java.lang.foreign.MemoryAddress sbc);
    static MemorySegment allocate(PFNWGLWAITFORSBCOMLPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLWAITFORSBCOMLPROC.class, fi, constants$1416.PFNWGLWAITFORSBCOMLPROC$FUNC, session);
    }
    static PFNWGLWAITFORSBCOMLPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hdc, long _target_sbc, java.lang.foreign.MemoryAddress _ust, java.lang.foreign.MemoryAddress _msc, java.lang.foreign.MemoryAddress _sbc) -> {
            try {
                return (int)constants$1416.PFNWGLWAITFORSBCOMLPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hdc, _target_sbc, (java.lang.foreign.Addressable)_ust, (java.lang.foreign.Addressable)_msc, (java.lang.foreign.Addressable)_sbc);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


