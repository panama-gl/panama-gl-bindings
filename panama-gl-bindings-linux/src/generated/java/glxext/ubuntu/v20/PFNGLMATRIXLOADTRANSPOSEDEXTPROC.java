// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMATRIXLOADTRANSPOSEDEXTPROC {

    void apply(int mode, java.lang.foreign.MemoryAddress m);
    static MemorySegment allocate(PFNGLMATRIXLOADTRANSPOSEDEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXLOADTRANSPOSEDEXTPROC.class, fi, constants$654.PFNGLMATRIXLOADTRANSPOSEDEXTPROC$FUNC, session);
    }
    static PFNGLMATRIXLOADTRANSPOSEDEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, java.lang.foreign.MemoryAddress _m) -> {
            try {
                constants$654.PFNGLMATRIXLOADTRANSPOSEDEXTPROC$MH.invokeExact((Addressable)symbol, _mode, (java.lang.foreign.Addressable)_m);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


