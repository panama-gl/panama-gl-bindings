// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETUNIFORMBUFFERSIZEEXTPROC {

    int apply(int program, int location);
    static MemorySegment allocate(PFNGLGETUNIFORMBUFFERSIZEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMBUFFERSIZEEXTPROC.class, fi, constants$516.PFNGLGETUNIFORMBUFFERSIZEEXTPROC$FUNC, session);
    }
    static PFNGLGETUNIFORMBUFFERSIZEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location) -> {
            try {
                return (int)constants$516.PFNGLGETUNIFORMBUFFERSIZEEXTPROC$MH.invokeExact((Addressable)symbol, _program, _location);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


