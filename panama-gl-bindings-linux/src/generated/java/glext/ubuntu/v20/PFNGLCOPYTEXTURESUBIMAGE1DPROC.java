// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYTEXTURESUBIMAGE1DPROC {

    void apply(int texture, int level, int xoffset, int x, int y, int width);
    static MemorySegment allocate(PFNGLCOPYTEXTURESUBIMAGE1DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXTURESUBIMAGE1DPROC.class, fi, constants$378.PFNGLCOPYTEXTURESUBIMAGE1DPROC$FUNC, session);
    }
    static PFNGLCOPYTEXTURESUBIMAGE1DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _level, int _xoffset, int _x, int _y, int _width) -> {
            try {
                constants$378.PFNGLCOPYTEXTURESUBIMAGE1DPROC$MH.invokeExact((Addressable)symbol, _texture, _level, _xoffset, _x, _y, _width);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


