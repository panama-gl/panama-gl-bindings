// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSTENCILMASKSEPARATEPROC {

    void apply(int face, int mask);
    static MemorySegment allocate(PFNGLSTENCILMASKSEPARATEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILMASKSEPARATEPROC.class, fi, constants$125.PFNGLSTENCILMASKSEPARATEPROC$FUNC, session);
    }
    static PFNGLSTENCILMASKSEPARATEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _face, int _mask) -> {
            try {
                constants$125.PFNGLSTENCILMASKSEPARATEPROC$MH.invokeExact((Addressable)symbol, _face, _mask);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


