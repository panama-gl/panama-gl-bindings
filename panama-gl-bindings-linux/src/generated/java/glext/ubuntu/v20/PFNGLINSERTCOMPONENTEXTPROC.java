// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINSERTCOMPONENTEXTPROC {

    void apply(int res, int src, int num);
    static MemorySegment allocate(PFNGLINSERTCOMPONENTEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINSERTCOMPONENTEXTPROC.class, fi, constants$685.PFNGLINSERTCOMPONENTEXTPROC$FUNC, session);
    }
    static PFNGLINSERTCOMPONENTEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _res, int _src, int _num) -> {
            try {
                constants$685.PFNGLINSERTCOMPONENTEXTPROC$MH.invokeExact((Addressable)symbol, _res, _src, _num);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


