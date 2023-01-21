// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMBINARYPROC {

    void apply(int program, int binaryFormat, java.lang.foreign.MemoryAddress binary, int length);
    static MemorySegment allocate(PFNGLPROGRAMBINARYPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMBINARYPROC.class, fi, constants$306.PFNGLPROGRAMBINARYPROC$FUNC, session);
    }
    static PFNGLPROGRAMBINARYPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _binaryFormat, java.lang.foreign.MemoryAddress _binary, int _length) -> {
            try {
                constants$306.PFNGLPROGRAMBINARYPROC$MH.invokeExact((Addressable)symbol, _program, _binaryFormat, (java.lang.foreign.Addressable)_binary, _length);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


