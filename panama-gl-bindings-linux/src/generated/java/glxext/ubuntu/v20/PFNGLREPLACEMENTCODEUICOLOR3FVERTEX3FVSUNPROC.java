// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROC {

    void apply(java.lang.foreign.MemoryAddress rc, java.lang.foreign.MemoryAddress c, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROC.class, fi, constants$1010.PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROC$FUNC, session);
    }
    static PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _rc, java.lang.foreign.MemoryAddress _c, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$1010.PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_rc, (java.lang.foreign.Addressable)_c, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


