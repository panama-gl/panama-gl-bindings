// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAPVERTEXATTRIB1FAPPLEPROC {

    void apply(int index, int size, float u1, float u2, int stride, int order, java.lang.foreign.MemoryAddress points);
    static MemorySegment allocate(PFNGLMAPVERTEXATTRIB1FAPPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAPVERTEXATTRIB1FAPPLEPROC.class, fi, constants$570.PFNGLMAPVERTEXATTRIB1FAPPLEPROC$FUNC, session);
    }
    static PFNGLMAPVERTEXATTRIB1FAPPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _size, float _u1, float _u2, int _stride, int _order, java.lang.foreign.MemoryAddress _points) -> {
            try {
                constants$570.PFNGLMAPVERTEXATTRIB1FAPPLEPROC$MH.invokeExact((Addressable)symbol, _index, _size, _u1, _u2, _stride, _order, (java.lang.foreign.Addressable)_points);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

