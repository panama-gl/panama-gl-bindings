// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINORMAL3FVEXTPROC {

    void apply(java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLBINORMAL3FVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINORMAL3FVEXTPROC.class, fi, constants$745.PFNGLBINORMAL3FVEXTPROC$FUNC, session);
    }
    static PFNGLBINORMAL3FVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$745.PFNGLBINORMAL3FVEXTPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


