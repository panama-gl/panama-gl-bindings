// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAPVERTEXATTRIB1DAPPLEPROC {

    void apply(int index, int size, double u1, double u2, int stride, int order, java.lang.foreign.MemoryAddress points);
    static MemorySegment allocate(PFNGLMAPVERTEXATTRIB1DAPPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAPVERTEXATTRIB1DAPPLEPROC.class, fi, constants$485.PFNGLMAPVERTEXATTRIB1DAPPLEPROC$FUNC, session);
    }
    static PFNGLMAPVERTEXATTRIB1DAPPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _size, double _u1, double _u2, int _stride, int _order, java.lang.foreign.MemoryAddress _points) -> {
            try {
                constants$485.PFNGLMAPVERTEXATTRIB1DAPPLEPROC$MH.invokeExact((Addressable)symbol, _index, _size, _u1, _u2, _stride, _order, (java.lang.foreign.Addressable)_points);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


