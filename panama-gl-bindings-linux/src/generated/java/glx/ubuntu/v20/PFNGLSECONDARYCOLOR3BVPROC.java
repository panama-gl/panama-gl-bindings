// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSECONDARYCOLOR3BVPROC {

    void apply(java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLSECONDARYCOLOR3BVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3BVPROC.class, fi, constants$181.PFNGLSECONDARYCOLOR3BVPROC$FUNC, session);
    }
    static PFNGLSECONDARYCOLOR3BVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$181.PFNGLSECONDARYCOLOR3BVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


