// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPOINTPARAMETERFPROC {

    void apply(int pname, float param);
    static MemorySegment allocate(PFNGLPOINTPARAMETERFPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPOINTPARAMETERFPROC.class, fi, constants$177.PFNGLPOINTPARAMETERFPROC$FUNC, session);
    }
    static PFNGLPOINTPARAMETERFPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, float _param) -> {
            try {
                constants$177.PFNGLPOINTPARAMETERFPROC$MH.invokeExact((Addressable)symbol, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


