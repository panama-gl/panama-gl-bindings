// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMLOCALPARAMETERI4UINVPROC {

    void apply(int target, int index, int x, int y, int z, int w);
    static MemorySegment allocate(PFNGLPROGRAMLOCALPARAMETERI4UINVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMLOCALPARAMETERI4UINVPROC.class, fi, constants$759.PFNGLPROGRAMLOCALPARAMETERI4UINVPROC$FUNC, session);
    }
    static PFNGLPROGRAMLOCALPARAMETERI4UINVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, int _x, int _y, int _z, int _w) -> {
            try {
                constants$759.PFNGLPROGRAMLOCALPARAMETERI4UINVPROC$MH.invokeExact((Addressable)symbol, _target, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


