// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAPCONTROLPOINTSNVPROC {

    void apply(int target, int index, int type, int ustride, int vstride, int uorder, int vorder, byte packed, java.lang.foreign.MemoryAddress points);
    static MemorySegment allocate(PFNGLMAPCONTROLPOINTSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAPCONTROLPOINTSNVPROC.class, fi, constants$743.PFNGLMAPCONTROLPOINTSNVPROC$FUNC, session);
    }
    static PFNGLMAPCONTROLPOINTSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, int _type, int _ustride, int _vstride, int _uorder, int _vorder, byte _packed, java.lang.foreign.MemoryAddress _points) -> {
            try {
                constants$743.PFNGLMAPCONTROLPOINTSNVPROC$MH.invokeExact((Addressable)symbol, _target, _index, _type, _ustride, _vstride, _uorder, _vorder, _packed, (java.lang.foreign.Addressable)_points);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


