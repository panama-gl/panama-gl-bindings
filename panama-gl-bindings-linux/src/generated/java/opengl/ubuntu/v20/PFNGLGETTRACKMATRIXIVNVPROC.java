// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTRACKMATRIXIVNVPROC {

    void apply(int target, int address, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETTRACKMATRIXIVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTRACKMATRIXIVNVPROC.class, fi, constants$852.PFNGLGETTRACKMATRIXIVNVPROC$FUNC, session);
    }
    static PFNGLGETTRACKMATRIXIVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _address, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$852.PFNGLGETTRACKMATRIXIVNVPROC$MH.invokeExact((Addressable)symbol, _target, _address, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


