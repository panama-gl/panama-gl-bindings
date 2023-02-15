// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM3DVEXTPROC {

    void apply(int program, int location, int count, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM3DVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3DVEXTPROC.class, fi, constants$697.PFNGLPROGRAMUNIFORM3DVEXTPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM3DVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _count, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$697.PFNGLPROGRAMUNIFORM3DVEXTPROC$MH.invokeExact((Addressable)symbol, _program, _location, _count, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


