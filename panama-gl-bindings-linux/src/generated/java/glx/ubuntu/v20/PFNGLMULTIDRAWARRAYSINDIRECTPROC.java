// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTIDRAWARRAYSINDIRECTPROC {

    void apply(int mode, java.lang.foreign.MemoryAddress indirect, int drawcount, int stride);
    static MemorySegment allocate(PFNGLMULTIDRAWARRAYSINDIRECTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWARRAYSINDIRECTPROC.class, fi, constants$343.PFNGLMULTIDRAWARRAYSINDIRECTPROC$FUNC, session);
    }
    static PFNGLMULTIDRAWARRAYSINDIRECTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, java.lang.foreign.MemoryAddress _indirect, int _drawcount, int _stride) -> {
            try {
                constants$343.PFNGLMULTIDRAWARRAYSINDIRECTPROC$MH.invokeExact((Addressable)symbol, _mode, (java.lang.foreign.Addressable)_indirect, _drawcount, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


