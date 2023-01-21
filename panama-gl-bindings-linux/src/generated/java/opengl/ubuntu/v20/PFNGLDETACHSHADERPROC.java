// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDETACHSHADERPROC {

    void apply(int program, int shader);
    static MemorySegment allocate(PFNGLDETACHSHADERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDETACHSHADERPROC.class, fi, constants$117.PFNGLDETACHSHADERPROC$FUNC, session);
    }
    static PFNGLDETACHSHADERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _shader) -> {
            try {
                constants$117.PFNGLDETACHSHADERPROC$MH.invokeExact((Addressable)symbol, _program, _shader);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


