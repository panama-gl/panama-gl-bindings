// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD1HNVPROC {

    void apply(int target, short s);
    static MemorySegment allocate(PFNGLMULTITEXCOORD1HNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1HNVPROC.class, fi, constants$856.PFNGLMULTITEXCOORD1HNVPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD1HNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, short _s) -> {
            try {
                constants$856.PFNGLMULTITEXCOORD1HNVPROC$MH.invokeExact((Addressable)symbol, _target, _s);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

