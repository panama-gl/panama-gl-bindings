// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMPARAMETERIPROC {

    void apply(int program, int pname, int value);
    static MemorySegment allocate(PFNGLPROGRAMPARAMETERIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMPARAMETERIPROC.class, fi, constants$307.PFNGLPROGRAMPARAMETERIPROC$FUNC, session);
    }
    static PFNGLPROGRAMPARAMETERIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _pname, int _value) -> {
            try {
                constants$307.PFNGLPROGRAMPARAMETERIPROC$MH.invokeExact((Addressable)symbol, _program, _pname, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


