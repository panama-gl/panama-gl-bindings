// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMATRIXTRANSLATEDEXTPROC {

    void apply(int mode, double x, double y, double z);
    static MemorySegment allocate(PFNGLMATRIXTRANSLATEDEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXTRANSLATEDEXTPROC.class, fi, constants$624.PFNGLMATRIXTRANSLATEDEXTPROC$FUNC, session);
    }
    static PFNGLMATRIXTRANSLATEDEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, double _x, double _y, double _z) -> {
            try {
                constants$624.PFNGLMATRIXTRANSLATEDEXTPROC$MH.invokeExact((Addressable)symbol, _mode, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


