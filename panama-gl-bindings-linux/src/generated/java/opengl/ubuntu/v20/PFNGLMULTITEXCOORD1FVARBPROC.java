// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD1FVARBPROC {

    void apply(int target, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLMULTITEXCOORD1FVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1FVARBPROC.class, fi, constants$81.PFNGLMULTITEXCOORD1FVARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD1FVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$81.PFNGLMULTITEXCOORD1FVARBPROC$MH.invokeExact((Addressable)symbol, _target, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


