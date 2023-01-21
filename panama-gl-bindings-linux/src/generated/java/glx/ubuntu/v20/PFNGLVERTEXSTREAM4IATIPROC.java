// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXSTREAM4IATIPROC {

    void apply(int stream, int x, int y, int z, int w);
    static MemorySegment allocate(PFNGLVERTEXSTREAM4IATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM4IATIPROC.class, fi, constants$594.PFNGLVERTEXSTREAM4IATIPROC$FUNC, session);
    }
    static PFNGLVERTEXSTREAM4IATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stream, int _x, int _y, int _z, int _w) -> {
            try {
                constants$594.PFNGLVERTEXSTREAM4IATIPROC$MH.invokeExact((Addressable)symbol, _stream, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


