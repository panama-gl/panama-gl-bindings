// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM3UIPROC {

    void apply(int program, int location, int v0, int v1, int v2);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM3UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3UIPROC.class, fi, constants$317.PFNGLPROGRAMUNIFORM3UIPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM3UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _v0, int _v1, int _v2) -> {
            try {
                constants$317.PFNGLPROGRAMUNIFORM3UIPROC$MH.invokeExact((Addressable)symbol, _program, _location, _v0, _v1, _v2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


