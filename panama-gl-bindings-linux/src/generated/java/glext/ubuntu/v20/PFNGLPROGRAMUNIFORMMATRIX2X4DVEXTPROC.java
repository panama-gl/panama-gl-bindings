// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROC {

    void apply(int program, int location, int count, byte transpose, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROC.class, fi, constants$614.PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _count, byte _transpose, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$614.PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROC$MH.invokeExact((Addressable)symbol, _program, _location, _count, _transpose, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


