// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM4IPROC {

    void apply(int program, int location, int v0, int v1, int v2, int v3);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM4IPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4IPROC.class, fi, constants$296.PFNGLPROGRAMUNIFORM4IPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM4IPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _v0, int _v1, int _v2, int _v3) -> {
            try {
                constants$296.PFNGLPROGRAMUNIFORM4IPROC$MH.invokeExact((Addressable)symbol, _program, _location, _v0, _v1, _v2, _v3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


