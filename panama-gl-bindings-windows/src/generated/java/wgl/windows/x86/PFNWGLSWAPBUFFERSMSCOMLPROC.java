// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLSWAPBUFFERSMSCOMLPROC {

    long apply(java.lang.foreign.MemoryAddress hdc, long target_msc, long divisor, long remainder);
    static MemorySegment allocate(PFNWGLSWAPBUFFERSMSCOMLPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLSWAPBUFFERSMSCOMLPROC.class, fi, constants$1415.PFNWGLSWAPBUFFERSMSCOMLPROC$FUNC, session);
    }
    static PFNWGLSWAPBUFFERSMSCOMLPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hdc, long _target_msc, long _divisor, long _remainder) -> {
            try {
                return (long)constants$1415.PFNWGLSWAPBUFFERSMSCOMLPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hdc, _target_msc, _divisor, _remainder);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


