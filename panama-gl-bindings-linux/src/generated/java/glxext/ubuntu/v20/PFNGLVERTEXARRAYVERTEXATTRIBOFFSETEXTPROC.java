// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC {

    void apply(int vaobj, int buffer, int index, int size, int type, byte normalized, int stride, long offset);
    static MemorySegment allocate(PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC.class, fi, constants$690.PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC$FUNC, session);
    }
    static PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _buffer, int _index, int _size, int _type, byte _normalized, int _stride, long _offset) -> {
            try {
                constants$690.PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC$MH.invokeExact((Addressable)symbol, _vaobj, _buffer, _index, _size, _type, _normalized, _stride, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

