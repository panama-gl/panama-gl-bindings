// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC {

    void apply(int vaobj, int buffer, int size, int type, int stride, long offset);
    static MemorySegment allocate(PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC.class, fi, constants$689.PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC$FUNC, session);
    }
    static PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _buffer, int _size, int _type, int _stride, long _offset) -> {
            try {
                constants$689.PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC$MH.invokeExact((Addressable)symbol, _vaobj, _buffer, _size, _type, _stride, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


