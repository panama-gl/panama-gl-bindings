// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBS3HVNVPROC {

    void apply(int index, int n, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLVERTEXATTRIBS3HVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBS3HVNVPROC.class, fi, constants$864.PFNGLVERTEXATTRIBS3HVNVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBS3HVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _n, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$864.PFNGLVERTEXATTRIBS3HVNVPROC$MH.invokeExact((Addressable)symbol, _index, _n, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


