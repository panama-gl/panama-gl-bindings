// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETFRAGDATAINDEXPROC {

    int apply(int program, java.lang.foreign.MemoryAddress name);
    static MemorySegment allocate(PFNGLGETFRAGDATAINDEXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETFRAGDATAINDEXPROC.class, fi, constants$270.PFNGLGETFRAGDATAINDEXPROC$FUNC, session);
    }
    static PFNGLGETFRAGDATAINDEXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, java.lang.foreign.MemoryAddress _name) -> {
            try {
                return (int)constants$270.PFNGLGETFRAGDATAINDEXPROC$MH.invokeExact((Addressable)symbol, _program, (java.lang.foreign.Addressable)_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


