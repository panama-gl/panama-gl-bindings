// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXSTREAM1IVATIPROC {

    void apply(int stream, java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLVERTEXSTREAM1IVATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM1IVATIPROC.class, fi, constants$705.PFNGLVERTEXSTREAM1IVATIPROC$FUNC, session);
    }
    static PFNGLVERTEXSTREAM1IVATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stream, java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$705.PFNGLVERTEXSTREAM1IVATIPROC$MH.invokeExact((Addressable)symbol, _stream, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


