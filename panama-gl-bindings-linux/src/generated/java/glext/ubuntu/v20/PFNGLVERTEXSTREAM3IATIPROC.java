// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXSTREAM3IATIPROC {

    void apply(int stream, int x, int y, int z);
    static MemorySegment allocate(PFNGLVERTEXSTREAM3IATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM3IATIPROC.class, fi, constants$506.PFNGLVERTEXSTREAM3IATIPROC$FUNC, session);
    }
    static PFNGLVERTEXSTREAM3IATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stream, int _x, int _y, int _z) -> {
            try {
                constants$506.PFNGLVERTEXSTREAM3IATIPROC$MH.invokeExact((Addressable)symbol, _stream, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


