// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC {

    void apply(int program, int location, int genMode, int components, java.lang.foreign.MemoryAddress coeffs);
    static MemorySegment allocate(PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC.class, fi, constants$890.PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC$FUNC, session);
    }
    static PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _genMode, int _components, java.lang.foreign.MemoryAddress _coeffs) -> {
            try {
                constants$890.PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC$MH.invokeExact((Addressable)symbol, _program, _location, _genMode, _components, (java.lang.foreign.Addressable)_coeffs);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

