// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDEPTHBOUNDSEXTPROC {

    void apply(double zmin, double zmax);
    static MemorySegment allocate(PFNGLDEPTHBOUNDSEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDEPTHBOUNDSEXTPROC.class, fi, constants$621.PFNGLDEPTHBOUNDSEXTPROC$FUNC, session);
    }
    static PFNGLDEPTHBOUNDSEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (double _zmin, double _zmax) -> {
            try {
                constants$621.PFNGLDEPTHBOUNDSEXTPROC$MH.invokeExact((Addressable)symbol, _zmin, _zmax);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


