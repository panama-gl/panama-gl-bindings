// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLENDQUERYARBPROC {

    void apply(int target);
    static MemorySegment allocate(PFNGLENDQUERYARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLENDQUERYARBPROC.class, fi, constants$432.PFNGLENDQUERYARBPROC$FUNC, session);
    }
    static PFNGLENDQUERYARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target) -> {
            try {
                constants$432.PFNGLENDQUERYARBPROC$MH.invokeExact((Addressable)symbol, _target);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


