// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM1UIPROC {

    void apply(int program, int location, int v0);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM1UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM1UIPROC.class, fi, constants$226.PFNGLPROGRAMUNIFORM1UIPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM1UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _v0) -> {
            try {
                constants$226.PFNGLPROGRAMUNIFORM1UIPROC$MH.invokeExact((Addressable)symbol, _program, _location, _v0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


