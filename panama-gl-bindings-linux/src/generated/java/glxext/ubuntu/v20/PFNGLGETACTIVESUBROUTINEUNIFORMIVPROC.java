// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC {

    void apply(int program, int shadertype, int index, int pname, java.lang.foreign.MemoryAddress values);
    static MemorySegment allocate(PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC.class, fi, constants$298.PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC$FUNC, session);
    }
    static PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _shadertype, int _index, int _pname, java.lang.foreign.MemoryAddress _values) -> {
            try {
                constants$298.PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC$MH.invokeExact((Addressable)symbol, _program, _shadertype, _index, _pname, (java.lang.foreign.Addressable)_values);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


