// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPATCHPARAMETERIPROC {

    void apply(int pname, int value);
    static MemorySegment allocate(PFNGLPATCHPARAMETERIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPATCHPARAMETERIPROC.class, fi, constants$300.PFNGLPATCHPARAMETERIPROC$FUNC, session);
    }
    static PFNGLPATCHPARAMETERIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, int _value) -> {
            try {
                constants$300.PFNGLPATCHPARAMETERIPROC$MH.invokeExact((Addressable)symbol, _pname, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

