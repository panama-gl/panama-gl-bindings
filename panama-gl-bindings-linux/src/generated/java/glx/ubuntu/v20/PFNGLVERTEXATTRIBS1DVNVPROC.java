// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBS1DVNVPROC {

    void apply(int index, int count, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLVERTEXATTRIBS1DVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBS1DVNVPROC.class, fi, constants$952.PFNGLVERTEXATTRIBS1DVNVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBS1DVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _count, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$952.PFNGLVERTEXATTRIBS1DVNVPROC$MH.invokeExact((Addressable)symbol, _index, _count, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


