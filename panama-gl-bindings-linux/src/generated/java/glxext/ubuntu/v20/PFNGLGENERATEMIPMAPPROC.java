// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGENERATEMIPMAPPROC {

    void apply(int target);
    static MemorySegment allocate(PFNGLGENERATEMIPMAPPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGENERATEMIPMAPPROC.class, fi, constants$256.PFNGLGENERATEMIPMAPPROC$FUNC, session);
    }
    static PFNGLGENERATEMIPMAPPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target) -> {
            try {
                constants$256.PFNGLGENERATEMIPMAPPROC$MH.invokeExact((Addressable)symbol, _target);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


