// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLEXTRACTCOMPONENTEXTPROC {

    void apply(int res, int src, int num);
    static MemorySegment allocate(PFNGLEXTRACTCOMPONENTEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLEXTRACTCOMPONENTEXTPROC.class, fi, constants$771.PFNGLEXTRACTCOMPONENTEXTPROC$FUNC, session);
    }
    static PFNGLEXTRACTCOMPONENTEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _res, int _src, int _num) -> {
            try {
                constants$771.PFNGLEXTRACTCOMPONENTEXTPROC$MH.invokeExact((Addressable)symbol, _res, _src, _num);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


