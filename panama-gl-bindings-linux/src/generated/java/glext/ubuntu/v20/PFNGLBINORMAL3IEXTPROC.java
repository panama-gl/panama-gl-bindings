// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINORMAL3IEXTPROC {

    void apply(int bx, int by, int bz);
    static MemorySegment allocate(PFNGLBINORMAL3IEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINORMAL3IEXTPROC.class, fi, constants$529.PFNGLBINORMAL3IEXTPROC$FUNC, session);
    }
    static PFNGLBINORMAL3IEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _bx, int _by, int _bz) -> {
            try {
                constants$529.PFNGLBINORMAL3IEXTPROC$MH.invokeExact((Addressable)symbol, _bx, _by, _bz);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


