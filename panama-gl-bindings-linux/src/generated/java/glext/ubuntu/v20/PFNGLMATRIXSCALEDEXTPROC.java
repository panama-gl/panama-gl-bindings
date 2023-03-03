// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMATRIXSCALEDEXTPROC {

    void apply(int mode, double x, double y, double z);
    static MemorySegment allocate(PFNGLMATRIXSCALEDEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXSCALEDEXTPROC.class, fi, constants$760.PFNGLMATRIXSCALEDEXTPROC$FUNC, session);
    }
    static PFNGLMATRIXSCALEDEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, double _x, double _y, double _z) -> {
            try {
                constants$760.PFNGLMATRIXSCALEDEXTPROC$MH.invokeExact((Addressable)symbol, _mode, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

