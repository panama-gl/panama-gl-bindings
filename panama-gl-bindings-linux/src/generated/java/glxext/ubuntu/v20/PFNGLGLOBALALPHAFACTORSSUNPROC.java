// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGLOBALALPHAFACTORSSUNPROC {

    void apply(short factor);
    static MemorySegment allocate(PFNGLGLOBALALPHAFACTORSSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGLOBALALPHAFACTORSSUNPROC.class, fi, constants$995.PFNGLGLOBALALPHAFACTORSSUNPROC$FUNC, session);
    }
    static PFNGLGLOBALALPHAFACTORSSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _factor) -> {
            try {
                constants$995.PFNGLGLOBALALPHAFACTORSSUNPROC$MH.invokeExact((Addressable)symbol, _factor);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


