// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPNTRIANGLESFATIPROC {

    void apply(int pname, float param);
    static MemorySegment allocate(PFNGLPNTRIANGLESFATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPNTRIANGLESFATIPROC.class, fi, constants$580.PFNGLPNTRIANGLESFATIPROC$FUNC, session);
    }
    static PFNGLPNTRIANGLESFATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, float _param) -> {
            try {
                constants$580.PFNGLPNTRIANGLESFATIPROC$MH.invokeExact((Addressable)symbol, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

