// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETUNIFORMFVARBPROC {

    void apply(int programObj, int location, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETUNIFORMFVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMFVARBPROC.class, fi, constants$455.PFNGLGETUNIFORMFVARBPROC$FUNC, session);
    }
    static PFNGLGETUNIFORMFVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _programObj, int _location, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$455.PFNGLGETUNIFORMFVARBPROC$MH.invokeExact((Addressable)symbol, _programObj, _location, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


