// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD1FARBPROC {

    void apply(int target, float s);
    static MemorySegment allocate(PFNGLMULTITEXCOORD1FARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1FARBPROC.class, fi, constants$166.PFNGLMULTITEXCOORD1FARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD1FARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, float _s) -> {
            try {
                constants$166.PFNGLMULTITEXCOORD1FARBPROC$MH.invokeExact((Addressable)symbol, _target, _s);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

