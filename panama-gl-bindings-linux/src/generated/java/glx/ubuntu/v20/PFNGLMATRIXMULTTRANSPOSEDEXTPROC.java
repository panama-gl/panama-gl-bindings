// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMATRIXMULTTRANSPOSEDEXTPROC {

    void apply(int mode, java.lang.foreign.MemoryAddress m);
    static MemorySegment allocate(PFNGLMATRIXMULTTRANSPOSEDEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXMULTTRANSPOSEDEXTPROC.class, fi, constants$655.PFNGLMATRIXMULTTRANSPOSEDEXTPROC$FUNC, session);
    }
    static PFNGLMATRIXMULTTRANSPOSEDEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, java.lang.foreign.MemoryAddress _m) -> {
            try {
                constants$655.PFNGLMATRIXMULTTRANSPOSEDEXTPROC$MH.invokeExact((Addressable)symbol, _mode, (java.lang.foreign.Addressable)_m);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

