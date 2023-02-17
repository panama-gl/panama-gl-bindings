// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETIMAGEHANDLEARBPROC {

    long apply(int texture, int level, byte layered, int layer, int format);
    static MemorySegment allocate(PFNGLGETIMAGEHANDLEARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETIMAGEHANDLEARBPROC.class, fi, constants$424.PFNGLGETIMAGEHANDLEARBPROC$FUNC, session);
    }
    static PFNGLGETIMAGEHANDLEARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _level, byte _layered, int _layer, int _format) -> {
            try {
                return (long)constants$424.PFNGLGETIMAGEHANDLEARBPROC$MH.invokeExact((Addressable)symbol, _texture, _level, _layered, _layer, _format);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


