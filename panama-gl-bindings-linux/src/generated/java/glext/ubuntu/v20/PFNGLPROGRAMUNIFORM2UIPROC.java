// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM2UIPROC {

    void apply(int program, int location, int v0, int v1);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM2UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2UIPROC.class, fi, constants$293.PFNGLPROGRAMUNIFORM2UIPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM2UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _v0, int _v1) -> {
            try {
                constants$293.PFNGLPROGRAMUNIFORM2UIPROC$MH.invokeExact((Addressable)symbol, _program, _location, _v0, _v1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


