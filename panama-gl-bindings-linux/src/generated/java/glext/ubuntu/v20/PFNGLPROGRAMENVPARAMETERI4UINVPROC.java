// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMENVPARAMETERI4UINVPROC {

    void apply(int target, int index, int x, int y, int z, int w);
    static MemorySegment allocate(PFNGLPROGRAMENVPARAMETERI4UINVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMENVPARAMETERI4UINVPROC.class, fi, constants$1093.PFNGLPROGRAMENVPARAMETERI4UINVPROC$FUNC, session);
    }
    static PFNGLPROGRAMENVPARAMETERI4UINVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, int _x, int _y, int _z, int _w) -> {
            try {
                constants$1093.PFNGLPROGRAMENVPARAMETERI4UINVPROC$MH.invokeExact((Addressable)symbol, _target, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


