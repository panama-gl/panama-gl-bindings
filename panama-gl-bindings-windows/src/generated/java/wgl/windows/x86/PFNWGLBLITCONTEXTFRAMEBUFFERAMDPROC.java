// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLBLITCONTEXTFRAMEBUFFERAMDPROC {

    void apply(java.lang.foreign.MemoryAddress dstCtx, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter);
    static MemorySegment allocate(PFNWGLBLITCONTEXTFRAMEBUFFERAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLBLITCONTEXTFRAMEBUFFERAMDPROC.class, fi, constants$1386.PFNWGLBLITCONTEXTFRAMEBUFFERAMDPROC$FUNC, session);
    }
    static PFNWGLBLITCONTEXTFRAMEBUFFERAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dstCtx, int _srcX0, int _srcY0, int _srcX1, int _srcY1, int _dstX0, int _dstY0, int _dstX1, int _dstY1, int _mask, int _filter) -> {
            try {
                constants$1386.PFNWGLBLITCONTEXTFRAMEBUFFERAMDPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dstCtx, _srcX0, _srcY0, _srcX1, _srcY1, _dstX0, _dstY0, _dstX1, _dstY1, _mask, _filter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


