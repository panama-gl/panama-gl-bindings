// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD4DARBPROC {

    void apply(int target, double s, double t, double r, double q);
    static MemorySegment allocate(PFNGLMULTITEXCOORD4DARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4DARBPROC.class, fi, constants$174.PFNGLMULTITEXCOORD4DARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD4DARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, double _s, double _t, double _r, double _q) -> {
            try {
                constants$174.PFNGLMULTITEXCOORD4DARBPROC$MH.invokeExact((Addressable)symbol, _target, _s, _t, _r, _q);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


