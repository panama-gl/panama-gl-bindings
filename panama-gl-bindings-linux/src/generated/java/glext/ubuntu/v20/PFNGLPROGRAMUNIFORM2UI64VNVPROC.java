// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM2UI64VNVPROC {

    void apply(int program, int location, int count, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM2UI64VNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2UI64VNVPROC.class, fi, constants$647.PFNGLPROGRAMUNIFORM2UI64VNVPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM2UI64VNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _count, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$647.PFNGLPROGRAMUNIFORM2UI64VNVPROC$MH.invokeExact((Addressable)symbol, _program, _location, _count, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


