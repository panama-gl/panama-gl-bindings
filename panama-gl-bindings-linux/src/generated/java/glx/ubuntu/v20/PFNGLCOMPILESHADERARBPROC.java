// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOMPILESHADERARBPROC {

    void apply(int shaderObj);
    static MemorySegment allocate(PFNGLCOMPILESHADERARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOMPILESHADERARBPROC.class, fi, constants$444.PFNGLCOMPILESHADERARBPROC$FUNC, session);
    }
    static PFNGLCOMPILESHADERARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _shaderObj) -> {
            try {
                constants$444.PFNGLCOMPILESHADERARBPROC$MH.invokeExact((Addressable)symbol, _shaderObj);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


