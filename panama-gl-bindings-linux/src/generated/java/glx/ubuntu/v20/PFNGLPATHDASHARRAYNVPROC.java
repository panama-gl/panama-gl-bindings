// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPATHDASHARRAYNVPROC {

    void apply(int path, int dashCount, java.lang.foreign.MemoryAddress dashArray);
    static MemorySegment allocate(PFNGLPATHDASHARRAYNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPATHDASHARRAYNVPROC.class, fi, constants$877.PFNGLPATHDASHARRAYNVPROC$FUNC, session);
    }
    static PFNGLPATHDASHARRAYNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path, int _dashCount, java.lang.foreign.MemoryAddress _dashArray) -> {
            try {
                constants$877.PFNGLPATHDASHARRAYNVPROC$MH.invokeExact((Addressable)symbol, _path, _dashCount, (java.lang.foreign.Addressable)_dashArray);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


