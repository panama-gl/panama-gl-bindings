// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM2FPROC {

    void apply(int location, float v0, float v1);
    static MemorySegment allocate(PFNGLUNIFORM2FPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2FPROC.class, fi, constants$125.PFNGLUNIFORM2FPROC$FUNC, session);
    }
    static PFNGLUNIFORM2FPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, float _v0, float _v1) -> {
            try {
                constants$125.PFNGLUNIFORM2FPROC$MH.invokeExact((Addressable)symbol, _location, _v0, _v1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


