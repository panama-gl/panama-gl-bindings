// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPATHCOORDSNVPROC {

    void apply(int path, java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLGETPATHCOORDSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHCOORDSNVPROC.class, fi, constants$797.PFNGLGETPATHCOORDSNVPROC$FUNC, session);
    }
    static PFNGLGETPATHCOORDSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path, java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$797.PFNGLGETPATHCOORDSNVPROC$MH.invokeExact((Addressable)symbol, _path, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


