// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPROGRAMENVPARAMETERFVARBPROC {

    void apply(int target, int index, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETPROGRAMENVPARAMETERFVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMENVPARAMETERFVARBPROC.class, fi, constants$412.PFNGLGETPROGRAMENVPARAMETERFVARBPROC$FUNC, session);
    }
    static PFNGLGETPROGRAMENVPARAMETERFVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$412.PFNGLGETPROGRAMENVPARAMETERFVARBPROC$MH.invokeExact((Addressable)symbol, _target, _index, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


