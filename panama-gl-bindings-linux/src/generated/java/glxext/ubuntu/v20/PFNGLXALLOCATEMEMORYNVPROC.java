// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXALLOCATEMEMORYNVPROC {

    java.lang.foreign.Addressable apply(int size, float readfreq, float writefreq, float priority);
    static MemorySegment allocate(PFNGLXALLOCATEMEMORYNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXALLOCATEMEMORYNVPROC.class, fi, constants$1060.PFNGLXALLOCATEMEMORYNVPROC$FUNC, session);
    }
    static PFNGLXALLOCATEMEMORYNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _size, float _readfreq, float _writefreq, float _priority) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$1060.PFNGLXALLOCATEMEMORYNVPROC$MH.invokeExact((Addressable)symbol, _size, _readfreq, _writefreq, _priority);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

