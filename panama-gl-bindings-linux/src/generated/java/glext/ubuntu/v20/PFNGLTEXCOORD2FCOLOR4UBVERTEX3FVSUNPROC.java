// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROC {

    void apply(java.lang.foreign.MemoryAddress tc, java.lang.foreign.MemoryAddress c, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROC.class, fi, constants$1331.PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROC$FUNC, session);
    }
    static PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _tc, java.lang.foreign.MemoryAddress _c, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$1331.PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_tc, (java.lang.foreign.Addressable)_c, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


