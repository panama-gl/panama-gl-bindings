// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD3SARBPROC {

    void apply(int target, short s, short t, short r);
    static MemorySegment allocate(PFNGLMULTITEXCOORD3SARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3SARBPROC.class, fi, constants$173.PFNGLMULTITEXCOORD3SARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD3SARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, short _s, short _t, short _r) -> {
            try {
                constants$173.PFNGLMULTITEXCOORD3SARBPROC$MH.invokeExact((Addressable)symbol, _target, _s, _t, _r);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


