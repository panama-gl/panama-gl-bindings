// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXSTREAM4DVATIPROC {

    void apply(int stream, java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLVERTEXSTREAM4DVATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM4DVATIPROC.class, fi, constants$511.PFNGLVERTEXSTREAM4DVATIPROC$FUNC, session);
    }
    static PFNGLVERTEXSTREAM4DVATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stream, java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$511.PFNGLVERTEXSTREAM4DVATIPROC$MH.invokeExact((Addressable)symbol, _stream, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


