// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPNTRIANGLESIATIPROC {

    void apply(int pname, int param);
    static MemorySegment allocate(PFNGLPNTRIANGLESIATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPNTRIANGLESIATIPROC.class, fi, constants$494.PFNGLPNTRIANGLESIATIPROC$FUNC, session);
    }
    static PFNGLPNTRIANGLESIATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, int _param) -> {
            try {
                constants$494.PFNGLPNTRIANGLESIATIPROC$MH.invokeExact((Addressable)symbol, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


