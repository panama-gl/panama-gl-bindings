// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVDPAUGETSURFACEIVNVPROC {

    void apply(long surface, int pname, int bufSize, java.lang.foreign.MemoryAddress length, java.lang.foreign.MemoryAddress values);
    static MemorySegment allocate(PFNGLVDPAUGETSURFACEIVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUGETSURFACEIVNVPROC.class, fi, constants$922.PFNGLVDPAUGETSURFACEIVNVPROC$FUNC, session);
    }
    static PFNGLVDPAUGETSURFACEIVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _surface, int _pname, int _bufSize, java.lang.foreign.MemoryAddress _length, java.lang.foreign.MemoryAddress _values) -> {
            try {
                constants$922.PFNGLVDPAUGETSURFACEIVNVPROC$MH.invokeExact((Addressable)symbol, _surface, _pname, _bufSize, (java.lang.foreign.Addressable)_length, (java.lang.foreign.Addressable)_values);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

