// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLRENDERGPUMASKNVPROC {

    void apply(int mask);
    static MemorySegment allocate(PFNGLRENDERGPUMASKNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLRENDERGPUMASKNVPROC.class, fi, constants$754.PFNGLRENDERGPUMASKNVPROC$FUNC, session);
    }
    static PFNGLRENDERGPUMASKNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mask) -> {
            try {
                constants$754.PFNGLRENDERGPUMASKNVPROC$MH.invokeExact((Addressable)symbol, _mask);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


