// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVDPAUMAPSURFACESNVPROC {

    void apply(int numSurfaces, java.lang.foreign.MemoryAddress surfaces);
    static MemorySegment allocate(PFNGLVDPAUMAPSURFACESNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUMAPSURFACESNVPROC.class, fi, constants$837.PFNGLVDPAUMAPSURFACESNVPROC$FUNC, session);
    }
    static PFNGLVDPAUMAPSURFACESNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _numSurfaces, java.lang.foreign.MemoryAddress _surfaces) -> {
            try {
                constants$837.PFNGLVDPAUMAPSURFACESNVPROC$MH.invokeExact((Addressable)symbol, _numSurfaces, (java.lang.foreign.Addressable)_surfaces);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


