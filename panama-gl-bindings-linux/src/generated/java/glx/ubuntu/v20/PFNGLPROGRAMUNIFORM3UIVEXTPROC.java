// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM3UIVEXTPROC {

    void apply(int program, int location, int count, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM3UIVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3UIVEXTPROC.class, fi, constants$671.PFNGLPROGRAMUNIFORM3UIVEXTPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM3UIVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _count, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$671.PFNGLPROGRAMUNIFORM3UIVEXTPROC$MH.invokeExact((Addressable)symbol, _program, _location, _count, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


