// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPATHSTENCILDEPTHOFFSETNVPROC {

    void apply(float factor, float units);
    static MemorySegment allocate(PFNGLPATHSTENCILDEPTHOFFSETNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPATHSTENCILDEPTHOFFSETNVPROC.class, fi, constants$1139.PFNGLPATHSTENCILDEPTHOFFSETNVPROC$FUNC, session);
    }
    static PFNGLPATHSTENCILDEPTHOFFSETNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _factor, float _units) -> {
            try {
                constants$1139.PFNGLPATHSTENCILDEPTHOFFSETNVPROC$MH.invokeExact((Addressable)symbol, _factor, _units);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


