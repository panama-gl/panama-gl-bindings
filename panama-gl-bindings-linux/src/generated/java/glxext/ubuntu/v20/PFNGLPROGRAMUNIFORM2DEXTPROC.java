// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM2DEXTPROC {

    void apply(int program, int location, double x, double y);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM2DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2DEXTPROC.class, fi, constants$696.PFNGLPROGRAMUNIFORM2DEXTPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM2DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, double _x, double _y) -> {
            try {
                constants$696.PFNGLPROGRAMUNIFORM2DEXTPROC$MH.invokeExact((Addressable)symbol, _program, _location, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


