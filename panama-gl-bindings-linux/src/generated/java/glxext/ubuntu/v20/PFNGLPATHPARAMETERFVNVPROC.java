// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPATHPARAMETERFVNVPROC {

    void apply(int path, int pname, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLPATHPARAMETERFVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPATHPARAMETERFVNVPROC.class, fi, constants$877.PFNGLPATHPARAMETERFVNVPROC$FUNC, session);
    }
    static PFNGLPATHPARAMETERFVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path, int _pname, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$877.PFNGLPATHPARAMETERFVNVPROC$MH.invokeExact((Addressable)symbol, _path, _pname, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

