// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYCOLORTABLESGIPROC {

    void apply(int target, int internalformat, int x, int y, int width);
    static MemorySegment allocate(PFNGLCOPYCOLORTABLESGIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYCOLORTABLESGIPROC.class, fi, constants$1315.PFNGLCOPYCOLORTABLESGIPROC$FUNC, session);
    }
    static PFNGLCOPYCOLORTABLESGIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _internalformat, int _x, int _y, int _width) -> {
            try {
                constants$1315.PFNGLCOPYCOLORTABLESGIPROC$MH.invokeExact((Addressable)symbol, _target, _internalformat, _x, _y, _width);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


