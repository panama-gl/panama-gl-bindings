// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM3FPROC {

    void apply(int location, float v0, float v1, float v2);
    static MemorySegment allocate(PFNGLUNIFORM3FPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM3FPROC.class, fi, constants$126.PFNGLUNIFORM3FPROC$FUNC, session);
    }
    static PFNGLUNIFORM3FPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, float _v0, float _v1, float _v2) -> {
            try {
                constants$126.PFNGLUNIFORM3FPROC$MH.invokeExact((Addressable)symbol, _location, _v0, _v1, _v2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


