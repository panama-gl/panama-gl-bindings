// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD3FVARBPROC {

    void apply(int target, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLMULTITEXCOORD3FVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3FVARBPROC.class, fi, constants$172.PFNGLMULTITEXCOORD3FVARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD3FVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$172.PFNGLMULTITEXCOORD3FVARBPROC$MH.invokeExact((Addressable)symbol, _target, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

