// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD4SARBPROC {

    void apply(int target, short s, short t, short r, short q);
    static MemorySegment allocate(PFNGLMULTITEXCOORD4SARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4SARBPROC.class, fi, constants$90.PFNGLMULTITEXCOORD4SARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD4SARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, short _s, short _t, short _r, short _q) -> {
            try {
                constants$90.PFNGLMULTITEXCOORD4SARBPROC$MH.invokeExact((Addressable)symbol, _target, _s, _t, _r, _q);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


