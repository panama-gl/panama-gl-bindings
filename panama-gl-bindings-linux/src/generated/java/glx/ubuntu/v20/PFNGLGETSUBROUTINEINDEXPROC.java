// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETSUBROUTINEINDEXPROC {

    int apply(int program, int shadertype, java.lang.foreign.MemoryAddress name);
    static MemorySegment allocate(PFNGLGETSUBROUTINEINDEXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETSUBROUTINEINDEXPROC.class, fi, constants$298.PFNGLGETSUBROUTINEINDEXPROC$FUNC, session);
    }
    static PFNGLGETSUBROUTINEINDEXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _shadertype, java.lang.foreign.MemoryAddress _name) -> {
            try {
                return (int)constants$298.PFNGLGETSUBROUTINEINDEXPROC$MH.invokeExact((Addressable)symbol, _program, _shadertype, (java.lang.foreign.Addressable)_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


