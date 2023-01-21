// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXSTREAM4FATIPROC {

    void apply(int stream, float x, float y, float z, float w);
    static MemorySegment allocate(PFNGLVERTEXSTREAM4FATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM4FATIPROC.class, fi, constants$510.PFNGLVERTEXSTREAM4FATIPROC$FUNC, session);
    }
    static PFNGLVERTEXSTREAM4FATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stream, float _x, float _y, float _z, float _w) -> {
            try {
                constants$510.PFNGLVERTEXSTREAM4FATIPROC$MH.invokeExact((Addressable)symbol, _stream, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


