// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD1IARBPROC {

    void apply(int target, int s);
    static MemorySegment allocate(PFNGLMULTITEXCOORD1IARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1IARBPROC.class, fi, constants$167.PFNGLMULTITEXCOORD1IARBPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD1IARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _s) -> {
            try {
                constants$167.PFNGLMULTITEXCOORD1IARBPROC$MH.invokeExact((Addressable)symbol, _target, _s);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

