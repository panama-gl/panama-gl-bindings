// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCONSERVATIVERASTERPARAMETERINVPROC {

    void apply(int pname, int param);
    static MemorySegment allocate(PFNGLCONSERVATIVERASTERPARAMETERINVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCONSERVATIVERASTERPARAMETERINVPROC.class, fi, constants$824.PFNGLCONSERVATIVERASTERPARAMETERINVPROC$FUNC, session);
    }
    static PFNGLCONSERVATIVERASTERPARAMETERINVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, int _param) -> {
            try {
                constants$824.PFNGLCONSERVATIVERASTERPARAMETERINVPROC$MH.invokeExact((Addressable)symbol, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


