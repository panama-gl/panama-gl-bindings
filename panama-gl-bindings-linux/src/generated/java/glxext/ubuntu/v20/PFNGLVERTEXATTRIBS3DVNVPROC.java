// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBS3DVNVPROC {

    void apply(int index, int count, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLVERTEXATTRIBS3DVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBS3DVNVPROC.class, fi, constants$954.PFNGLVERTEXATTRIBS3DVNVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBS3DVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _count, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$954.PFNGLVERTEXATTRIBS3DVNVPROC$MH.invokeExact((Addressable)symbol, _index, _count, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


