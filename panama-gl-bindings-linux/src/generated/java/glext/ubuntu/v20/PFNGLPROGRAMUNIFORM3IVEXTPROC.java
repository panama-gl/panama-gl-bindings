// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM3IVEXTPROC {

    void apply(int program, int location, int count, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM3IVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3IVEXTPROC.class, fi, constants$577.PFNGLPROGRAMUNIFORM3IVEXTPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM3IVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _count, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$577.PFNGLPROGRAMUNIFORM3IVEXTPROC$MH.invokeExact((Addressable)symbol, _program, _location, _count, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


