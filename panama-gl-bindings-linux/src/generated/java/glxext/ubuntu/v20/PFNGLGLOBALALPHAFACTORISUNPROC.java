// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGLOBALALPHAFACTORISUNPROC {

    void apply(int factor);
    static MemorySegment allocate(PFNGLGLOBALALPHAFACTORISUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGLOBALALPHAFACTORISUNPROC.class, fi, constants$996.PFNGLGLOBALALPHAFACTORISUNPROC$FUNC, session);
    }
    static PFNGLGLOBALALPHAFACTORISUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _factor) -> {
            try {
                constants$996.PFNGLGLOBALALPHAFACTORISUNPROC$MH.invokeExact((Addressable)symbol, _factor);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


