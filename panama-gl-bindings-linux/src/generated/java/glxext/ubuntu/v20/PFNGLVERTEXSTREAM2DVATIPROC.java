// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXSTREAM2DVATIPROC {

    void apply(int stream, java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLVERTEXSTREAM2DVATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM2DVATIPROC.class, fi, constants$591.PFNGLVERTEXSTREAM2DVATIPROC$FUNC, session);
    }
    static PFNGLVERTEXSTREAM2DVATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stream, java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$591.PFNGLVERTEXSTREAM2DVATIPROC$MH.invokeExact((Addressable)symbol, _stream, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


