// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSHARPENTEXFUNCSGISPROC {

    void apply(int target, int n, java.lang.foreign.MemoryAddress points);
    static MemorySegment allocate(PFNGLSHARPENTEXFUNCSGISPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSHARPENTEXFUNCSGISPROC.class, fi, constants$973.PFNGLSHARPENTEXFUNCSGISPROC$FUNC, session);
    }
    static PFNGLSHARPENTEXFUNCSGISPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _n, java.lang.foreign.MemoryAddress _points) -> {
            try {
                constants$973.PFNGLSHARPENTEXFUNCSGISPROC$MH.invokeExact((Addressable)symbol, _target, _n, (java.lang.foreign.Addressable)_points);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


