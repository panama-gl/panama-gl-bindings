// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAPGRID2XOESPROC {

    void apply(int n, int u1, int u2, int v1, int v2);
    static MemorySegment allocate(PFNGLMAPGRID2XOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAPGRID2XOESPROC.class, fi, constants$595.PFNGLMAPGRID2XOESPROC$FUNC, session);
    }
    static PFNGLMAPGRID2XOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, int _u1, int _u2, int _v1, int _v2) -> {
            try {
                constants$595.PFNGLMAPGRID2XOESPROC$MH.invokeExact((Addressable)symbol, _n, _u1, _u2, _v1, _v2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


