// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLATTACHSHADERPROC {

    void apply(int program, int shader);
    static MemorySegment allocate(PFNGLATTACHSHADERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLATTACHSHADERPROC.class, fi, constants$200.PFNGLATTACHSHADERPROC$FUNC, session);
    }
    static PFNGLATTACHSHADERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _shader) -> {
            try {
                constants$200.PFNGLATTACHSHADERPROC$MH.invokeExact((Addressable)symbol, _program, _shader);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


