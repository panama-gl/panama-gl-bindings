// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROC {

    void apply(int vaobj, int buffer, int stride, long offset);
    static MemorySegment allocate(PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROC.class, fi, constants$687.PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROC$FUNC, session);
    }
    static PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _buffer, int _stride, long _offset) -> {
            try {
                constants$687.PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROC$MH.invokeExact((Addressable)symbol, _vaobj, _buffer, _stride, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

