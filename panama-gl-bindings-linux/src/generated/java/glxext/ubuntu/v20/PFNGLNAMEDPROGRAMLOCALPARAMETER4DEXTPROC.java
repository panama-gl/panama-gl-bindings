// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC {

    void apply(int program, int target, int index, double x, double y, double z, double w);
    static MemorySegment allocate(PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC.class, fi, constants$677.PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC$FUNC, session);
    }
    static PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _target, int _index, double _x, double _y, double _z, double _w) -> {
            try {
                constants$677.PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC$MH.invokeExact((Addressable)symbol, _program, _target, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

