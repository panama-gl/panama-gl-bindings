// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLEVALCOORD1XVOESPROC {

    void apply(java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLEVALCOORD1XVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLEVALCOORD1XVOESPROC.class, fi, constants$428.PFNGLEVALCOORD1XVOESPROC$FUNC, session);
    }
    static PFNGLEVALCOORD1XVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$428.PFNGLEVALCOORD1XVOESPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


