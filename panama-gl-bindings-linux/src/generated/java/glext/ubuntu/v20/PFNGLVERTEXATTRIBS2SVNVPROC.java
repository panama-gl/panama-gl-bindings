// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBS2SVNVPROC {

    void apply(int index, int count, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLVERTEXATTRIBS2SVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBS2SVNVPROC.class, fi, constants$1246.PFNGLVERTEXATTRIBS2SVNVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBS2SVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _count, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$1246.PFNGLVERTEXATTRIBS2SVNVPROC$MH.invokeExact((Addressable)symbol, _index, _count, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

