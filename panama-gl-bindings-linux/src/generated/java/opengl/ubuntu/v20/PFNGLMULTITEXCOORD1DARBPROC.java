// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD1DARBPROC {

    void apply(int target, double s);
    static MemorySegment allocate(PFNGLMULTITEXCOORD1DARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1DARBPROC.class, fi, constants$80.PFNGLMULTITEXCOORD1DARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD1DARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, double _s) -> {
            try {
                constants$80.PFNGLMULTITEXCOORD1DARBPROC$MH.invokeExact((Addressable)symbol, _target, _s);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


