// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTEXTURELEVELPARAMETERFVEXTPROC {

    void apply(int texture, int target, int level, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETTEXTURELEVELPARAMETERFVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURELEVELPARAMETERFVEXTPROC.class, fi, constants$546.PFNGLGETTEXTURELEVELPARAMETERFVEXTPROC$FUNC, session);
    }
    static PFNGLGETTEXTURELEVELPARAMETERFVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _target, int _level, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$546.PFNGLGETTEXTURELEVELPARAMETERFVEXTPROC$MH.invokeExact((Addressable)symbol, _texture, _target, _level, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


