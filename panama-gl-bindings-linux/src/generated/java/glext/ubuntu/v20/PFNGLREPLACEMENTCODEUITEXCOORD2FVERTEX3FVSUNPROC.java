// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC {

    void apply(java.lang.foreign.MemoryAddress rc, java.lang.foreign.MemoryAddress tc, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC.class, fi, constants$927.PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC$FUNC, session);
    }
    static PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _rc, java.lang.foreign.MemoryAddress _tc, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$927.PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_rc, (java.lang.foreign.Addressable)_tc, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


