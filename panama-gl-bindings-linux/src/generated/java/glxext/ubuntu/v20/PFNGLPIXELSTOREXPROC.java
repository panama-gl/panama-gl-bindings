// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPIXELSTOREXPROC {

    void apply(int pname, int param);
    static MemorySegment allocate(PFNGLPIXELSTOREXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPIXELSTOREXPROC.class, fi, constants$524.PFNGLPIXELSTOREXPROC$FUNC, session);
    }
    static PFNGLPIXELSTOREXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, int _param) -> {
            try {
                constants$524.PFNGLPIXELSTOREXPROC$MH.invokeExact((Addressable)symbol, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

