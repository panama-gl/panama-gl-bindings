// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPATHDASHARRAYNVPROC {

    void apply(int path, java.lang.foreign.MemoryAddress dashArray);
    static MemorySegment allocate(PFNGLGETPATHDASHARRAYNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHDASHARRAYNVPROC.class, fi, constants$883.PFNGLGETPATHDASHARRAYNVPROC$FUNC, session);
    }
    static PFNGLGETPATHDASHARRAYNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path, java.lang.foreign.MemoryAddress _dashArray) -> {
            try {
                constants$883.PFNGLGETPATHDASHARRAYNVPROC$MH.invokeExact((Addressable)symbol, _path, (java.lang.foreign.Addressable)_dashArray);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


