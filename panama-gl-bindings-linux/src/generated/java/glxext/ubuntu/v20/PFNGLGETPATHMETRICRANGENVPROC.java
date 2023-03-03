// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPATHMETRICRANGENVPROC {

    void apply(int metricQueryMask, int firstPathName, int numPaths, int stride, java.lang.foreign.MemoryAddress metrics);
    static MemorySegment allocate(PFNGLGETPATHMETRICRANGENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHMETRICRANGENVPROC.class, fi, constants$883.PFNGLGETPATHMETRICRANGENVPROC$FUNC, session);
    }
    static PFNGLGETPATHMETRICRANGENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _metricQueryMask, int _firstPathName, int _numPaths, int _stride, java.lang.foreign.MemoryAddress _metrics) -> {
            try {
                constants$883.PFNGLGETPATHMETRICRANGENVPROC$MH.invokeExact((Addressable)symbol, _metricQueryMask, _firstPathName, _numPaths, _stride, (java.lang.foreign.Addressable)_metrics);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

