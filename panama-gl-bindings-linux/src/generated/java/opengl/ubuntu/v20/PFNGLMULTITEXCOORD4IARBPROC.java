// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD4IARBPROC {

    void apply(int target, int s, int t, int r, int q);
    static MemorySegment allocate(PFNGLMULTITEXCOORD4IARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4IARBPROC.class, fi, constants$90.PFNGLMULTITEXCOORD4IARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD4IARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _s, int _t, int _r, int _q) -> {
            try {
                constants$90.PFNGLMULTITEXCOORD4IARBPROC$MH.invokeExact((Addressable)symbol, _target, _s, _t, _r, _q);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


