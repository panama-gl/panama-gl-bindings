// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETMAPATTRIBPARAMETERFVNVPROC {

    void apply(int target, int index, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETMAPATTRIBPARAMETERFVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETMAPATTRIBPARAMETERFVNVPROC.class, fi, constants$745.PFNGLGETMAPATTRIBPARAMETERFVNVPROC$FUNC, session);
    }
    static PFNGLGETMAPATTRIBPARAMETERFVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$745.PFNGLGETMAPATTRIBPARAMETERFVNVPROC$MH.invokeExact((Addressable)symbol, _target, _index, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


