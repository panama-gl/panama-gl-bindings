// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXARRAYNORMALOFFSETEXTPROC {

    void apply(int vaobj, int buffer, int type, int stride, long offset);
    static MemorySegment allocate(PFNGLVERTEXARRAYNORMALOFFSETEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYNORMALOFFSETEXTPROC.class, fi, constants$688.PFNGLVERTEXARRAYNORMALOFFSETEXTPROC$FUNC, session);
    }
    static PFNGLVERTEXARRAYNORMALOFFSETEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _buffer, int _type, int _stride, long _offset) -> {
            try {
                constants$688.PFNGLVERTEXARRAYNORMALOFFSETEXTPROC$MH.invokeExact((Addressable)symbol, _vaobj, _buffer, _type, _stride, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


