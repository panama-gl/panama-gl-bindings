// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVIEWPORTPOSITIONWSCALENVPROC {

    void apply(int index, float xcoeff, float ycoeff);
    static MemorySegment allocate(PFNGLVIEWPORTPOSITIONWSCALENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVIEWPORTPOSITIONWSCALENVPROC.class, fi, constants$1051.PFNGLVIEWPORTPOSITIONWSCALENVPROC$FUNC, session);
    }
    static PFNGLVIEWPORTPOSITIONWSCALENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, float _xcoeff, float _ycoeff) -> {
            try {
                constants$1051.PFNGLVIEWPORTPOSITIONWSCALENVPROC$MH.invokeExact((Addressable)symbol, _index, _xcoeff, _ycoeff);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


