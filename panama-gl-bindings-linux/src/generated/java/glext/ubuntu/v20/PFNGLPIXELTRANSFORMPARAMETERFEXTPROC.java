// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPIXELTRANSFORMPARAMETERFEXTPROC {

    void apply(int target, int pname, float param);
    static MemorySegment allocate(PFNGLPIXELTRANSFORMPARAMETERFEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPIXELTRANSFORMPARAMETERFEXTPROC.class, fi, constants$929.PFNGLPIXELTRANSFORMPARAMETERFEXTPROC$FUNC, session);
    }
    static PFNGLPIXELTRANSFORMPARAMETERFEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _pname, float _param) -> {
            try {
                constants$930.PFNGLPIXELTRANSFORMPARAMETERFEXTPROC$MH.invokeExact((Addressable)symbol, _target, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


