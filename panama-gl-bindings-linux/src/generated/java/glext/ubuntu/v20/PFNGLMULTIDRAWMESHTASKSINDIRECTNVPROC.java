// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTIDRAWMESHTASKSINDIRECTNVPROC {

    void apply(long indirect, int drawcount, int stride);
    static MemorySegment allocate(PFNGLMULTIDRAWMESHTASKSINDIRECTNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWMESHTASKSINDIRECTNVPROC.class, fi, constants$1126.PFNGLMULTIDRAWMESHTASKSINDIRECTNVPROC$FUNC, session);
    }
    static PFNGLMULTIDRAWMESHTASKSINDIRECTNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _indirect, int _drawcount, int _stride) -> {
            try {
                constants$1126.PFNGLMULTIDRAWMESHTASKSINDIRECTNVPROC$MH.invokeExact((Addressable)symbol, _indirect, _drawcount, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


