// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD3DARBPROC {

    void apply(int target, double s, double t, double r);
    static MemorySegment allocate(PFNGLMULTITEXCOORD3DARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3DARBPROC.class, fi, constants$86.PFNGLMULTITEXCOORD3DARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD3DARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, double _s, double _t, double _r) -> {
            try {
                constants$86.PFNGLMULTITEXCOORD3DARBPROC$MH.invokeExact((Addressable)symbol, _target, _s, _t, _r);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


