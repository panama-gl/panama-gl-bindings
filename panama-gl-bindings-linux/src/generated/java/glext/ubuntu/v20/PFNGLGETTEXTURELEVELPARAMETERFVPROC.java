// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTEXTURELEVELPARAMETERFVPROC {

    void apply(int texture, int level, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETTEXTURELEVELPARAMETERFVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURELEVELPARAMETERFVPROC.class, fi, constants$383.PFNGLGETTEXTURELEVELPARAMETERFVPROC$FUNC, session);
    }
    static PFNGLGETTEXTURELEVELPARAMETERFVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _level, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$383.PFNGLGETTEXTURELEVELPARAMETERFVPROC$MH.invokeExact((Addressable)symbol, _texture, _level, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


