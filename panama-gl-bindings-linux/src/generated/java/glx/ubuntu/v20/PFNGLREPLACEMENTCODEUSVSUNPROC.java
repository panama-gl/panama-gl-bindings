// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLREPLACEMENTCODEUSVSUNPROC {

    void apply(java.lang.foreign.MemoryAddress code);
    static MemorySegment allocate(PFNGLREPLACEMENTCODEUSVSUNPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUSVSUNPROC.class, fi, constants$999.PFNGLREPLACEMENTCODEUSVSUNPROC$FUNC, session);
    }
    static PFNGLREPLACEMENTCODEUSVSUNPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _code) -> {
            try {
                constants$999.PFNGLREPLACEMENTCODEUSVSUNPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_code);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


