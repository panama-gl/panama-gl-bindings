// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDLIGHTPARAMETEREXTPROC {

    int apply(int light, int value);
    static MemorySegment allocate(PFNGLBINDLIGHTPARAMETEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDLIGHTPARAMETEREXTPROC.class, fi, constants$776.PFNGLBINDLIGHTPARAMETEREXTPROC$FUNC, session);
    }
    static PFNGLBINDLIGHTPARAMETEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _light, int _value) -> {
            try {
                return (int)constants$776.PFNGLBINDLIGHTPARAMETEREXTPROC$MH.invokeExact((Addressable)symbol, _light, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


