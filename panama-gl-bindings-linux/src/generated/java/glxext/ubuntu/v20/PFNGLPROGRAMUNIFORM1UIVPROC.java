// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM1UIVPROC {

    void apply(int program, int location, int count, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM1UIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM1UIVPROC.class, fi, constants$312.PFNGLPROGRAMUNIFORM1UIVPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM1UIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _count, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$312.PFNGLPROGRAMUNIFORM1UIVPROC$MH.invokeExact((Addressable)symbol, _program, _location, _count, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


