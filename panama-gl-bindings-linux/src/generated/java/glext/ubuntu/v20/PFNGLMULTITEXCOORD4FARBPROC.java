// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD4FARBPROC {

    void apply(int target, float s, float t, float r, float q);
    static MemorySegment allocate(PFNGLMULTITEXCOORD4FARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4FARBPROC.class, fi, constants$89.PFNGLMULTITEXCOORD4FARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD4FARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, float _s, float _t, float _r, float _q) -> {
            try {
                constants$89.PFNGLMULTITEXCOORD4FARBPROC$MH.invokeExact((Addressable)symbol, _target, _s, _t, _r, _q);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


