// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSHADEROP3EXTPROC {

    void apply(int op, int res, int arg1, int arg2, int arg3);
    static MemorySegment allocate(PFNGLSHADEROP3EXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSHADEROP3EXTPROC.class, fi, constants$769.PFNGLSHADEROP3EXTPROC$FUNC, session);
    }
    static PFNGLSHADEROP3EXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _op, int _res, int _arg1, int _arg2, int _arg3) -> {
            try {
                constants$769.PFNGLSHADEROP3EXTPROC$MH.invokeExact((Addressable)symbol, _op, _res, _arg1, _arg2, _arg3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


