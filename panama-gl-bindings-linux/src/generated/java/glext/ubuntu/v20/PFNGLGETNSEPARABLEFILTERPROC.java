// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNSEPARABLEFILTERPROC {

    void apply(int target, int format, int type, int rowBufSize, java.lang.foreign.MemoryAddress row, int columnBufSize, java.lang.foreign.MemoryAddress column, java.lang.foreign.MemoryAddress span);
    static MemorySegment allocate(PFNGLGETNSEPARABLEFILTERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNSEPARABLEFILTERPROC.class, fi, constants$309.PFNGLGETNSEPARABLEFILTERPROC$FUNC, session);
    }
    static PFNGLGETNSEPARABLEFILTERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _format, int _type, int _rowBufSize, java.lang.foreign.MemoryAddress _row, int _columnBufSize, java.lang.foreign.MemoryAddress _column, java.lang.foreign.MemoryAddress _span) -> {
            try {
                constants$309.PFNGLGETNSEPARABLEFILTERPROC$MH.invokeExact((Addressable)symbol, _target, _format, _type, _rowBufSize, (java.lang.foreign.Addressable)_row, _columnBufSize, (java.lang.foreign.Addressable)_column, (java.lang.foreign.Addressable)_span);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


