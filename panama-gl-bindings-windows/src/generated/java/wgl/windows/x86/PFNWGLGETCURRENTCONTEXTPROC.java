// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLGETCURRENTCONTEXTPROC {

    java.lang.foreign.Addressable apply();
    static MemorySegment allocate(PFNWGLGETCURRENTCONTEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLGETCURRENTCONTEXTPROC.class, fi, constants$1372.PFNWGLGETCURRENTCONTEXTPROC$FUNC, session);
    }
    static PFNWGLGETCURRENTCONTEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$1372.PFNWGLGETCURRENTCONTEXTPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

