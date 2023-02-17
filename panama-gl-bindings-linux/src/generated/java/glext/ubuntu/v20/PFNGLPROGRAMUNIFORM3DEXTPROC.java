// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM3DEXTPROC {

    void apply(int program, int location, double x, double y, double z);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM3DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3DEXTPROC.class, fi, constants$832.PFNGLPROGRAMUNIFORM3DEXTPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM3DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, double _x, double _y, double _z) -> {
            try {
                constants$832.PFNGLPROGRAMUNIFORM3DEXTPROC$MH.invokeExact((Addressable)symbol, _program, _location, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


