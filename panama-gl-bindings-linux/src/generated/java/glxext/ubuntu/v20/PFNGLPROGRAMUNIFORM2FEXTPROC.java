// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM2FEXTPROC {

    void apply(int program, int location, float v0, float v1);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM2FEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2FEXTPROC.class, fi, constants$658.PFNGLPROGRAMUNIFORM2FEXTPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM2FEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, float _v0, float _v1) -> {
            try {
                constants$658.PFNGLPROGRAMUNIFORM2FEXTPROC$MH.invokeExact((Addressable)symbol, _program, _location, _v0, _v1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


