// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM3IEXTPROC {

    void apply(int program, int location, int v0, int v1, int v2);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM3IEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3IEXTPROC.class, fi, constants$659.PFNGLPROGRAMUNIFORM3IEXTPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM3IEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _v0, int _v1, int _v2) -> {
            try {
                constants$659.PFNGLPROGRAMUNIFORM3IEXTPROC$MH.invokeExact((Addressable)symbol, _program, _location, _v0, _v1, _v2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

