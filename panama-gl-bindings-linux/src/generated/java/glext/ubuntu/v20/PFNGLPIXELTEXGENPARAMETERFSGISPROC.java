// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPIXELTEXGENPARAMETERFSGISPROC {

    void apply(int pname, float param);
    static MemorySegment allocate(PFNGLPIXELTEXGENPARAMETERFSGISPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPIXELTEXGENPARAMETERFSGISPROC.class, fi, constants$1282.PFNGLPIXELTEXGENPARAMETERFSGISPROC$FUNC, session);
    }
    static PFNGLPIXELTEXGENPARAMETERFSGISPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, float _param) -> {
            try {
                constants$1282.PFNGLPIXELTEXGENPARAMETERFSGISPROC$MH.invokeExact((Addressable)symbol, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


