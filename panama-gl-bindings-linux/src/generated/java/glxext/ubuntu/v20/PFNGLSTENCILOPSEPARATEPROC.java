// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSTENCILOPSEPARATEPROC {

    void apply(int face, int sfail, int dpfail, int dppass);
    static MemorySegment allocate(PFNGLSTENCILOPSEPARATEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILOPSEPARATEPROC.class, fi, constants$199.PFNGLSTENCILOPSEPARATEPROC$FUNC, session);
    }
    static PFNGLSTENCILOPSEPARATEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _face, int _sfail, int _dpfail, int _dppass) -> {
            try {
                constants$199.PFNGLSTENCILOPSEPARATEPROC$MH.invokeExact((Addressable)symbol, _face, _sfail, _dpfail, _dppass);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


