// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGLOBALALPHAFACTORUISUNPROC {

    void apply(int factor);
    static MemorySegment allocate(PFNGLGLOBALALPHAFACTORUISUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGLOBALALPHAFACTORUISUNPROC.class, fi, constants$997.PFNGLGLOBALALPHAFACTORUISUNPROC$FUNC, session);
    }
    static PFNGLGLOBALALPHAFACTORUISUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _factor) -> {
            try {
                constants$997.PFNGLGLOBALALPHAFACTORUISUNPROC$MH.invokeExact((Addressable)symbol, _factor);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


