// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM3DPROC {

    void apply(int program, int location, double v0, double v1, double v2);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3DPROC.class, fi, constants$316.PFNGLPROGRAMUNIFORM3DPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, double _v0, double _v1, double _v2) -> {
            try {
                constants$316.PFNGLPROGRAMUNIFORM3DPROC$MH.invokeExact((Addressable)symbol, _program, _location, _v0, _v1, _v2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


