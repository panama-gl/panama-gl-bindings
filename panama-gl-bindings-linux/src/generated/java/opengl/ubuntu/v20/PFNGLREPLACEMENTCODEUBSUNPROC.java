// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLREPLACEMENTCODEUBSUNPROC {

    void apply(byte code);
    static MemorySegment allocate(PFNGLREPLACEMENTCODEUBSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUBSUNPROC.class, fi, constants$913.PFNGLREPLACEMENTCODEUBSUNPROC$FUNC, session);
    }
    static PFNGLREPLACEMENTCODEUBSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _code) -> {
            try {
                constants$913.PFNGLREPLACEMENTCODEUBSUNPROC$MH.invokeExact((Addressable)symbol, _code);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


