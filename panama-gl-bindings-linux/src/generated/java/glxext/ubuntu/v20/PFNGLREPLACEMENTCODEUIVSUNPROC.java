// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLREPLACEMENTCODEUIVSUNPROC {

    void apply(java.lang.foreign.MemoryAddress code);
    static MemorySegment allocate(PFNGLREPLACEMENTCODEUIVSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUIVSUNPROC.class, fi, constants$999.PFNGLREPLACEMENTCODEUIVSUNPROC$FUNC, session);
    }
    static PFNGLREPLACEMENTCODEUIVSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _code) -> {
            try {
                constants$999.PFNGLREPLACEMENTCODEUIVSUNPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_code);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


