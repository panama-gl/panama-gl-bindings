// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC {

    void apply(int program, int target, int index, int x, int y, int z, int w);
    static MemorySegment allocate(PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC.class, fi, constants$672.PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC$FUNC, session);
    }
    static PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _target, int _index, int _x, int _y, int _z, int _w) -> {
            try {
                constants$672.PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC$MH.invokeExact((Addressable)symbol, _program, _target, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


