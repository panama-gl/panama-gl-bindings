// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETINTERNALFORMATSAMPLEIVNVPROC {

    void apply(int target, int internalformat, int samples, int pname, int bufSize, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETINTERNALFORMATSAMPLEIVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETINTERNALFORMATSAMPLEIVNVPROC.class, fi, constants$864.PFNGLGETINTERNALFORMATSAMPLEIVNVPROC$FUNC, session);
    }
    static PFNGLGETINTERNALFORMATSAMPLEIVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _internalformat, int _samples, int _pname, int _bufSize, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$864.PFNGLGETINTERNALFORMATSAMPLEIVNVPROC$MH.invokeExact((Addressable)symbol, _target, _internalformat, _samples, _pname, _bufSize, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


