// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM4UIPROC {

    void apply(int program, int location, int v0, int v1, int v2, int v3);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM4UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4UIPROC.class, fi, constants$320.PFNGLPROGRAMUNIFORM4UIPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM4UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _v0, int _v1, int _v2, int _v3) -> {
            try {
                constants$320.PFNGLPROGRAMUNIFORM4UIPROC$MH.invokeExact((Addressable)symbol, _program, _location, _v0, _v1, _v2, _v3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


