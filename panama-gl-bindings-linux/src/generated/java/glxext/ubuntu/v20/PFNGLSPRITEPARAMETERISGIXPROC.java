// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSPRITEPARAMETERISGIXPROC {

    void apply(int pname, int param);
    static MemorySegment allocate(PFNGLSPRITEPARAMETERISGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSPRITEPARAMETERISGIXPROC.class, fi, constants$991.PFNGLSPRITEPARAMETERISGIXPROC$FUNC, session);
    }
    static PFNGLSPRITEPARAMETERISGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, int _param) -> {
            try {
                constants$991.PFNGLSPRITEPARAMETERISGIXPROC$MH.invokeExact((Addressable)symbol, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


