// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMATRIXLOADIDENTITYEXTPROC {

    void apply(int mode);
    static MemorySegment allocate(PFNGLMATRIXLOADIDENTITYEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXLOADIDENTITYEXTPROC.class, fi, constants$622.PFNGLMATRIXLOADIDENTITYEXTPROC$FUNC, session);
    }
    static PFNGLMATRIXLOADIDENTITYEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode) -> {
            try {
                constants$622.PFNGLMATRIXLOADIDENTITYEXTPROC$MH.invokeExact((Addressable)symbol, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


