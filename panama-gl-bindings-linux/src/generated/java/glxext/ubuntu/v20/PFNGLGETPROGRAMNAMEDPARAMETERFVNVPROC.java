// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROC {

    void apply(int id, int len, java.lang.foreign.MemoryAddress name, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROC.class, fi, constants$836.PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROC$FUNC, session);
    }
    static PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, int _len, java.lang.foreign.MemoryAddress _name, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$836.PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROC$MH.invokeExact((Addressable)symbol, _id, _len, (java.lang.foreign.Addressable)_name, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


