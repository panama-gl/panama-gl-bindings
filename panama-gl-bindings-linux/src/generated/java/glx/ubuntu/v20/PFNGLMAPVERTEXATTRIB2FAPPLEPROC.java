// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAPVERTEXATTRIB2FAPPLEPROC {

    void apply(int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, java.lang.foreign.MemoryAddress points);
    static MemorySegment allocate(PFNGLMAPVERTEXATTRIB2FAPPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAPVERTEXATTRIB2FAPPLEPROC.class, fi, constants$571.PFNGLMAPVERTEXATTRIB2FAPPLEPROC$FUNC, session);
    }
    static PFNGLMAPVERTEXATTRIB2FAPPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _size, float _u1, float _u2, int _ustride, int _uorder, float _v1, float _v2, int _vstride, int _vorder, java.lang.foreign.MemoryAddress _points) -> {
            try {
                constants$571.PFNGLMAPVERTEXATTRIB2FAPPLEPROC$MH.invokeExact((Addressable)symbol, _index, _size, _u1, _u2, _ustride, _uorder, _v1, _v2, _vstride, _vorder, (java.lang.foreign.Addressable)_points);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


