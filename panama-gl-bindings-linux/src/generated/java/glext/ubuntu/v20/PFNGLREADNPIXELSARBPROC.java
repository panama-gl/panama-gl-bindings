// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLREADNPIXELSARBPROC {

    void apply(int x, int y, int width, int height, int format, int type, int bufSize, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLREADNPIXELSARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLREADNPIXELSARBPROC.class, fi, constants$478.PFNGLREADNPIXELSARBPROC$FUNC, session);
    }
    static PFNGLREADNPIXELSARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _x, int _y, int _width, int _height, int _format, int _type, int _bufSize, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$479.PFNGLREADNPIXELSARBPROC$MH.invokeExact((Addressable)symbol, _x, _y, _width, _height, _format, _type, _bufSize, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

