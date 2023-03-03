// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYTEXTURESUBIMAGE2DPROC {

    void apply(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height);
    static MemorySegment allocate(PFNGLCOPYTEXTURESUBIMAGE2DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXTURESUBIMAGE2DPROC.class, fi, constants$379.PFNGLCOPYTEXTURESUBIMAGE2DPROC$FUNC, session);
    }
    static PFNGLCOPYTEXTURESUBIMAGE2DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _level, int _xoffset, int _yoffset, int _x, int _y, int _width, int _height) -> {
            try {
                constants$379.PFNGLCOPYTEXTURESUBIMAGE2DPROC$MH.invokeExact((Addressable)symbol, _texture, _level, _xoffset, _yoffset, _x, _y, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

