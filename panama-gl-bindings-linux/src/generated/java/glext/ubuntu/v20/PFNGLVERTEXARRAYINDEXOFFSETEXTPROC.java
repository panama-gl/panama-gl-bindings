// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXARRAYINDEXOFFSETEXTPROC {

    void apply(int vaobj, int buffer, int type, int stride, long offset);
    static MemorySegment allocate(PFNGLVERTEXARRAYINDEXOFFSETEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYINDEXOFFSETEXTPROC.class, fi, constants$824.PFNGLVERTEXARRAYINDEXOFFSETEXTPROC$FUNC, session);
    }
    static PFNGLVERTEXARRAYINDEXOFFSETEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _buffer, int _type, int _stride, long _offset) -> {
            try {
                constants$824.PFNGLVERTEXARRAYINDEXOFFSETEXTPROC$MH.invokeExact((Addressable)symbol, _vaobj, _buffer, _type, _stride, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

