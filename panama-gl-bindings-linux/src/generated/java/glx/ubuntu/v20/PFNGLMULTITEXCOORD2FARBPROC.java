// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD2FARBPROC {

    void apply(int target, float s, float t);
    static MemorySegment allocate(PFNGLMULTITEXCOORD2FARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD2FARBPROC.class, fi, constants$169.PFNGLMULTITEXCOORD2FARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD2FARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, float _s, float _t) -> {
            try {
                constants$169.PFNGLMULTITEXCOORD2FARBPROC$MH.invokeExact((Addressable)symbol, _target, _s, _t);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


