// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXWEIGHTHVNVPROC {

    void apply(java.lang.foreign.MemoryAddress weight);
    static MemorySegment allocate(PFNGLVERTEXWEIGHTHVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXWEIGHTHVNVPROC.class, fi, constants$775.PFNGLVERTEXWEIGHTHVNVPROC$FUNC, session);
    }
    static PFNGLVERTEXWEIGHTHVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _weight) -> {
            try {
                constants$775.PFNGLVERTEXWEIGHTHVNVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_weight);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


