// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM4FPROC {

    void apply(int program, int location, float v0, float v1, float v2, float v3);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM4FPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4FPROC.class, fi, constants$297.PFNGLPROGRAMUNIFORM4FPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM4FPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, float _v0, float _v1, float _v2, float _v3) -> {
            try {
                constants$297.PFNGLPROGRAMUNIFORM4FPROC$MH.invokeExact((Addressable)symbol, _program, _location, _v0, _v1, _v2, _v3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


