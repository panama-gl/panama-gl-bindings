// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCREATESHADEROBJECTARBPROC {

    int apply(int shaderType);
    static MemorySegment allocate(PFNGLCREATESHADEROBJECTARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCREATESHADEROBJECTARBPROC.class, fi, constants$491.PFNGLCREATESHADEROBJECTARBPROC$FUNC, session);
    }
    static PFNGLCREATESHADEROBJECTARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _shaderType) -> {
            try {
                return (int)constants$491.PFNGLCREATESHADEROBJECTARBPROC$MH.invokeExact((Addressable)symbol, _shaderType);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

