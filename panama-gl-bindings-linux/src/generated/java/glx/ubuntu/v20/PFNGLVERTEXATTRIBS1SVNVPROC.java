// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBS1SVNVPROC {

    void apply(int index, int count, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLVERTEXATTRIBS1SVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBS1SVNVPROC.class, fi, constants$952.PFNGLVERTEXATTRIBS1SVNVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBS1SVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _count, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$952.PFNGLVERTEXATTRIBS1SVNVPROC$MH.invokeExact((Addressable)symbol, _index, _count, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


