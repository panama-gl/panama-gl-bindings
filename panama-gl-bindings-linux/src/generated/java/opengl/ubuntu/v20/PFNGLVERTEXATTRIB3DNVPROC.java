// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB3DNVPROC {

    void apply(int index, double x, double y, double z);
    static MemorySegment allocate(PFNGLVERTEXATTRIB3DNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3DNVPROC.class, fi, constants$862.PFNGLVERTEXATTRIB3DNVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB3DNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, double _x, double _y, double _z) -> {
            try {
                constants$862.PFNGLVERTEXATTRIB3DNVPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


